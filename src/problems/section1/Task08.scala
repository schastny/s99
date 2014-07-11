package problems.section1

/**
 *
 * 1.08 (**) Eliminate consecutive duplicates of list elements.<br/>
 * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.<br/>
 *
 * Example:<br/>
 *     ?- compress([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).<br/>
 *     X = [a,b,c,a,d,e]<br/>
 */
object Task08 {

  // Solution #1
  def compress(list: List[Any]): List[Any] = {
    if (list == Nil)
      list
    else
      list.head :: compressInternal(list.tail, list.head)
  }

  def compressInternal(list: List[Any], currentChar: Any): List[Any] = {
    if (list==Nil)
      list
    else if (list.head==currentChar)
      compressInternal(list.tail, currentChar)
    else
      list.head :: compressInternal(list.tail, list.head)
  }

  // Solution #2
  def compress2(list: List[Any]): List[Any] = {
    if (list == Nil)
      list
    else
      list.head :: compressInternal2(list.tail, list.head)
  }

  def compressInternal2(list: List[Any], currentChar: Any): List[Any] = list match {
    case Nil =>
      list
    case x::xx =>
      if (x==currentChar)
        compressInternal2(xx, currentChar)
      else
        x :: compressInternal2(xx, x)
  }


}

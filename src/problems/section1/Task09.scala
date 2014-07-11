package problems.section1

/**
 * 1.09 (**) Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 */
object Task09 {

  def pack(list: List[Any]): List[List[Any]] = {
    if (list == Nil)
      Nil
    else
      packInternal(list.tail, List(list.head))
  }

  def packInternal(list: List[Any], sublist: List[Any]): List[List[Any]] = {
    if (list == Nil)
      List(sublist)
    else if (list.head==sublist.head)
      packInternal(list.tail, list.head :: sublist)
    else
      sublist :: packInternal(list.tail, List(list.head))
  }

}

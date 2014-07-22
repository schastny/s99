package problems.section1

/**
 * 1.11 (*) Modified run-length encoding.<br/>
 * Modify the result of problem 1.10 in such a way that if an element has no duplicates
 * it is simply copied into the result list.<br/>
 * Only elements with duplicates are transferred as [N,E] terms.<br/>
 * Example:<br/>
 *     ?- encode_modified([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).<br/>
 *     X = [[4,a],b,[2,c],[2,a],d,[4,e]]<br/>
 */
object Task11 {
  def encodeModified(list: List[Any]): List[Any] = {
    if (list == Nil)
      Nil
    else
      encodeInternal(list.tail, (1, list.head))
  }
  private def encodeInternal(list: List[Any], tuple: (Int, Any)): List[Any] = {
    if (list == Nil)
      List(Enc(tuple))
    else if (list.head == tuple._2)
      encodeInternal(list.tail, (tuple._1+1, tuple._2))
    else
      Enc(tuple) :: encodeInternal(list.tail, (1, list.head))
  }
}

/**
 * Only elements with duplicates are transferred as [N,E] terms.
 */
object Enc {
  def apply(tuple: (Int, Any)) =
    if (tuple._1==1)
      tuple._2
    else
      tuple
}

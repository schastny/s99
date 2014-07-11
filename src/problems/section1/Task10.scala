package problems.section1

/**
 * 1.10 (*) Run-length encoding of a list.
 * Use the result of problem 1.09 to implement the so-called run-length encoding data compression method.
 * Consecutive duplicates of elements are encoded as terms [N,E]
 * where N is the number of duplicates of the element E.
 *
 * Example:
 *     ?- encode([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
 *     X = [[4,a], [1,b], [2,c], [2,a], [1,d], [4,e]]
 */
object Task10 {

  def encode(list: List[Any]): List[(Int, Any)] = {
    if (list == Nil)
      Nil
    else
      encodeInternal(list.tail, (1, list.head))
  }

  def encodeInternal(list: List[Any], tuple: (Int, Any)): List[(Int, Any)] = {
    if (list == Nil)
      List(tuple)
    else if (list.head == tuple._2)
      encodeInternal(list.tail, (tuple._1+1, tuple._2))
    else
      tuple :: encodeInternal(list.tail, (1, list.head))
  }

}

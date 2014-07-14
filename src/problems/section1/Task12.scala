package problems.section1

import scala.util.matching.Regex

/**
 * 1.12 (**) Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem 1.11. Construct its uncompressed version.
 * X = [[4,a],b,[2,c],[2,a],d,[4,e]] => [a,a,a,a,b,c,c,a,a,d,e,e,e,e]
*/
object Task12 {

  def decodeString(str: String): List[Any] = {
    val runLengthTokens = new Regex("(\\[\\d,\\w\\]){1}?|\\w{1}?");
    runLengthTokens.findAllIn(str).toList map {
      x: String =>
        if (x.toString.startsWith("[")){
          val tupleArr = x.replaceAll("[\\[\\]]", "").split(",")
          (tupleArr(0).toInt, tupleArr(1))
        }
        else
          x
    }
  }

  def decode(list: List[Any]): List[Any] = {
    list match {
      case Nil => Nil
      case (x:Int, y)::z  =>  {
        val repeat = for (i <- 0 until x) yield y
        repeat.toList ++ decode(list.tail)
      }
      case x::z => x :: decode(list.tail)
    }
  }

}

package problems.section1

object Launcher11to20 {

  def main(args: Array[String]) {
    testTask11
    testTask12
  }

  def testTask11 {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( Task11 encodeModified  list )
    println
  }

  def testTask12 {
    val sourceString = "[4,a],b,[2,c],[2,a],d,[4,e]"
    val sourceList = Task12 decodeString sourceString
    val targetList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( "source: " + sourceString )
    println ( sourceList )
    println ( "target1: " + (Task12 decode sourceList) )
    println ( "target2: " + targetList )
  }

}
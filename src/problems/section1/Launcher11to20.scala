package problems.section1

object Launcher11to20 {

  def main(args: Array[String]) {
    testTask11
  }

  def testTask11 {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( Task11 encodeModified  list )
  }

}
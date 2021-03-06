package problems.section1

object Launcher01to10 {

  def main(args: Array[String]) {
//    testTask01
//    testTask02
//    testTask03
//    testTask04
//    testTask05
//    testTask06
//    testTask07
//    testTask08
//    testTask09
    testTask10
  }

  def testTask01 {
    println {
      Task01 lastElement List(1,2,3,45)
    }
  }

  def testTask02 {
    println {
      Task02 lastButOneElement List(1,2,3,4,5,6,7)
    }
  }

  def testTask03 {
    println {
      Task03 elementAt(List(1,2,3), 2)
    }
  }

  def testTask04 {
    println {
      Task04 countElements List(1,2,3,4)
    }
  }

  def testTask05 {
    println {
      Task05 reverseList List(1,2,3,4)
    }
  }

  def testTask06 {
    println {
      Task06 palindrome List(1,2,2,1)
    }
    println {
      Task06 palindrome List('x','a','m','a','x')
    }
  }

  def testTask07 {
    val list =
      List(
        'a',
        List(
          'b',
          List('c', 'd'),
          'e'
        )
      )
    println ( list )
    println ( Task07 flatten list )
    println ( Task07 flatten2 list )
  }

  def testTask08 {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( Task08 compress list )
    println ( Task08 compress2 list )
  }

  def testTask09 {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( Task09 pack list )
    println ( Task09 pack list )
  }

  def testTask10 {
    val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    println ( Task10 encode list )
    println ( Task10 encode list )
  }

}
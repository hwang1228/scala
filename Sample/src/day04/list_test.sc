package day04

object list_test {

	val a = List(1,"a",'c',true)              //> a  : List[Any] = List(1, a, c, true)
	
	val b = List(1,2,3,4)                     //> b  : List[Int] = List(1, 2, 3, 4)
	b.reduce(_ + _)                           //> res0: Int = 10
	b.foldRight(0)(_ + _)                     //> res1: Int = 10
	val c = List("a","b","c")                 //> c  : List[String] = List(a, b, c)
	c.reduce (_ + _)                          //> res2: String = abc
	
	println(c.toString)                       //> List(a, b, c)
	
}
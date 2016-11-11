package day03

object test_seq {

	def startsWithZero1(expr1 : List[Int]) =
		expr1 match {
			case List(0, _, _) => println("found It")
			case _ => println("....")
		}                                 //> startsWithZero1: (expr1: List[Int])Unit
		
	def startsWithZero2(expr1 : List[Int]) =
		expr1 match {
			case List(0, _*) => println("found It")
			case _ =>
		}                                 //> startsWithZero2: (expr1: List[Int])Unit
		
	startsWithZero1(List(0, 100, 200) )       //> found It
	startsWithZero1(List(0, 100) )            //> ....
	
	startsWithZero2(List(0, 100, 200) )       //> found It
	startsWithZero2(List(0, 100) )            //> found It
}
package day03

object test_tuple {
	def tupleDemo(expr:Any) =
		expr match {
			case (a,b,c) => println("matches " + a +" " +b+ " " +c)
			case _ =>
		}                                 //> tupleDemo: (expr: Any)Unit
		
		tupleDemo(("a",3,"-tuple"))       //> matches a 3 -tuple
		
		def tupleDemo2(expr:Any) =
		expr match {
			case (a,b,_) => println("matches " + expr)
			case _ =>
		}                                 //> tupleDemo2: (expr: Any)Unit
		
		tupleDemo2(("a",3,"-tuple"))      //> matches (a,3,-tuple)
}
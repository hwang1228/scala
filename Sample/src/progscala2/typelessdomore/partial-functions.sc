// src/main/scala/progscala2/typelessdomore/partial-functions.sc

object test3 {

	val pf1: PartialFunction[Any,String] = { case s:String => "YES" }    // <1>
                                                  //> pf1  : PartialFunction[Any,String] = <function1>
	val pf2: PartialFunction[Any,String] = { case d:Double => "YES" }    // <2>
                                                  //> pf2  : PartialFunction[Any,String] = <function1>
                                                  
  val pf3: PartialFunction[Any,String] = {
  	case s:String => "STR"
  	case d:Double => "DOUBLE"
  	case i:Integer => "INT" }    // <1>       //> pf3  : PartialFunction[Any,String] = <function1>
	
	val pf = pf1 orElse pf2                                              // <3>
                                                  //> pf  : PartialFunction[Any,String] = <function1>
	
	def tryPF(x: Any, f: PartialFunction[Any,String]): String =          // <4>
	  try { f(x).toString } catch { case _: MatchError => "ERROR!" }
                                                  //> tryPF: (x: Any, f: PartialFunction[Any,String])String
	
	def d(x: Any, f: PartialFunction[Any,String]) =                      // <5>
	  f.isDefinedAt(x).toString               //> d: (x: Any, f: PartialFunction[Any,String])String
	
	println("      |   pf1 - String  |   pf2 - Double  |    pf - All	|	pf3 - Type")   // <6>
                                                  //>       |   pf1 - String  |   pf2 - Double  |    pf - All	|	pf3 - Ty
                                                  //| pe
	println("x     | def?  |  pf1(x) | def?  |  pf2(x) | def?  |  pf(x)	|	pf3(x)	|	def?")
                                                  //> x     | def?  |  pf1(x) | def?  |  pf2(x) | def?  |  pf(x)	|	pf3(x)	
                                                  //| |	def?
	println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
                                                  //> ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	List("str", 3.14, 10) foreach { x =>
	  printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s	|	%-5s	|	%-6s\n", x.toString,
	    d(x,pf1), tryPF(x,pf1), d(x,pf2), tryPF(x,pf2), d(x,pf), tryPF(x,pf), d(x,pf3), tryPF(x,pf3))
                                                  //> str   | true  | YES     | false | ERROR!  | true  | YES   	|	true 	
                                                  //| |	STR   
                                                  //| 3.14  | false | ERROR!  | true  | YES     | true  | YES   	|	true 	
                                                  //| |	DOUBLE
                                                  //| 10    | false | ERROR!  | false | ERROR!  | false | ERROR!	|	true 	
                                                  //| |	INT   
	}
}
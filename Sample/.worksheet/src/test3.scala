// src/main/scala/progscala2/typelessdomore/partial-functions.sc

object test3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(158); 

	val pf1: PartialFunction[Any,String] = { case s:String => "YES" };System.out.println("""pf1  : PartialFunction[Any,String] = """ + $show(pf1 ));$skip(77);     // <1>
	val pf2: PartialFunction[Any,String] = { case d:Double => "YES" };System.out.println("""pf2  : PartialFunction[Any,String] = """ + $show(pf2 ));$skip(188);     // <2>
                                                  
  val pf3: PartialFunction[Any,String] = {
  	case s:String => "STR"
  	case d:Double => "DOUBLE"
  	case i:Integer => "INT" };System.out.println("""pf3  : PartialFunction[Any,String] = """ + $show(pf3 ));$skip(79);     // <1>
	
	val pf = pf1 orElse pf2;System.out.println("""pf  : PartialFunction[Any,String] = """ + $show(pf ));$skip(145);                                               // <3>
	
	def tryPF(x: Any, f: PartialFunction[Any,String]): String =          // <4>
	  try { f(x).toString } catch { case _: MatchError => "ERROR!" };System.out.println("""tryPF: (x: Any, f: PartialFunction[Any,String])String""");$skip(108); 
	
	def d(x: Any, f: PartialFunction[Any,String]) =                      // <5>
	  f.isDefinedAt(x).toString;System.out.println("""d: (x: Any, f: PartialFunction[Any,String])String""");$skip(92); 
	
	println("      |   pf1 - String  |   pf2 - Double  |    pf - All	|	pf3 - Type");$skip(87);    // <6>
	println("x     | def?  |  pf1(x) | def?  |  pf2(x) | def?  |  pf(x)	|	pf3(x)	|	def?");$skip(71); 
	println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");$skip(227); 
	List("str", 3.14, 10) foreach { x =>
	  printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s	|	%-5s	|	%-6s\n", x.toString,
	    d(x,pf1), tryPF(x,pf1), d(x,pf2), tryPF(x,pf2), d(x,pf), tryPF(x,pf), d(x,pf3), tryPF(x,pf3))}
	}
}

// src/main/scala/progscala2/traits/trait-construction.sc
object test_trait_construction {
	trait T1 {
	  println(s"  in T1: x = $x")
	  val x=1
	  println(s"  in T1: x = $x")
	}
	
	trait T2 {
	  println(s"  in T2: y = $y")
	  val y="T2"
	  println(s"  in T2: y = $y")
	}
	
	class Base12 {
	  println(s"  in Base12: b = $b")
	  val b="Base12"
	  println(s"  in Base12: b = $b")
	}
	
	class C12 extends Base12 with T1 with T2 {
	  println(s"  in C12: c = $c")
	  val c="C12"
	  println(s"  in C12: c = $c")
	}
	
	println(s"Creating C12:")                 //> Creating C12:
	new C12                                   //>   in Base12: b = null
                                                  //|   in Base12: b = Base12
                                                  //|   in T1: x = 0
                                                  //|   in T1: x = 1
                                                  //|   in T2: y = null
                                                  //|   in T2: y = T2
                                                  //|   in C12: c = null
                                                  //|   in C12: c = C12
                                                  //| res0: test_trait_construction.C12 = test_trait_construction$C12@2acf57e3
	println(s"After Creating C12")            //> After Creating C12

}
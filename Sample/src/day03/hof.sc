package day03

object hof {
	val numbers = List(1,2,3,4)               //> numbers  : List[Int] = List(1, 2, 3, 4)
	Set(1,1,2)                                //> res0: scala.collection.immutable.Set[Int] = Set(1, 2)
	val hostPort = ("localhost", 80)          //> hostPort  : (String, Int) = (localhost,80)
	hostPort._1                               //> res1: String = localhost
	hostPort._2                               //> res2: Int = 80
	
	Map(1->2)                                 //> res3: scala.collection.immutable.Map[Int,Int] = Map(1 -> 2)
	Map("foo" -> "bar")                       //> res4: scala.collection.immutable.Map[String,String] = Map(foo -> bar)
	Map(1 -> Map("foo" -> "bar") )            //> res5: scala.collection.immutable.Map[Int,scala.collection.immutable.Map[Stri
                                                  //| ng,String]] = Map(1 -> Map(foo -> bar))
  val num = Map("one" -> 1 , "two" -> 2)          //> num  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, two -> 2)
                                                  //| 
  
  num.get("two")                                  //> res6: Option[Int] = Some(2)
  num.get("three")                                //> res7: Option[Int] = None
  
  numbers.map((i:Int) => i *2)                    //> res8: List[Int] = List(2, 4, 6, 8)
  
  def timesTwo(i: Int): Int = i*2                 //> timesTwo: (i: Int)Int
  numbers.map(timesTwo _)                         //> res9: List[Int] = List(2, 4, 6, 8)
  numbers.foreach((i:Int) => i*2)
  val doubled = numbers.foreach((i:Int) => i*2)   //> doubled  : Unit = ()
  
  numbers.filter((i:Int) => i%2 == 0)             //> res10: List[Int] = List(2, 4)
  
  def isEven(i:Int):Boolean = i%2 == 0            //> isEven: (i: Int)Boolean
 
  numbers.filter(isEven _)                        //> res11: List[Int] = List(2, 4)
  
  List(1,2,3) zip List("a","b","c")               //> res12: List[(Int, String)] = List((1,a), (2,b), (3,c))
  List(1,2,3).zip(List("a","b","c"))              //> res13: List[(Int, String)] = List((1,a), (2,b), (3,c))
}
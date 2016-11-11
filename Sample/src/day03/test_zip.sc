package day03

object test_zip {
	val ziplist = List(1,2,3,4,5) zip List("A","B","C") toList
                                                  //> ziplist  : List[(Int, String)] = List((1,A), (2,B), (3,C))
	val ziplist1 = List(1,2,3,4,5) zip List("A","B","C") toMap
                                                  //> ziplist1  : scala.collection.immutable.Map[Int,String] = Map(1 -> A, 2 -> B,
                                                  //|  3 -> C)
	
}
package day03

object match_bool {
	val bools = Seq(true, false)              //> bools  : Seq[Boolean] = List(true, false)
	for(boo <- bools)
		boo match {
			case true  => println("TRUE")
//			case false => println("FALSE")
		  case _ => println("Out of match")
	}                                         //> TRUE
                                                  //| Out of match
                                                  
  for(x <- Seq(1,2,2.7,"one","two", 'four, null) ) {
  	val str = x match {
  		case 1 						=> "int 1"
  		case _:Int 				=> "other int: " + x
  		case _:Double 		=> "Double: " + x
  		case "one" 				=> "string " + x
  		case _:String 		=> "String: " + x
  		case null					=> "null"
  		case _ 						=> "unexpected " + x
  	}
  	println(str)
  }                                               //> int 1
                                                  //| other int: 2
                                                  //| Double: 2.7
                                                  //| string one
                                                  //| String: two
                                                  //| unexpected 'four
                                                  //| null
  
  def checkY(y:Int) = {
	  for {
	  	x <- Seq(99, 100, 101)
	  	} {
		  	val str = x match {
		  		case `y` 						=> "found y!"
		  		case i:Int 				=> "int: " + i
		  	}
		  	println(str)
	  }
  
  }                                               //> checkY: (y: Int)Unit
  
  checkY(100)                                     //> int: 99
                                                  //| found y!
                                                  //| int: 101
                                                  
  val nonEmptySeq = Seq(1,2,3,4,5)                //> nonEmptySeq  : Seq[Int] = List(1, 2, 3, 4, 5)
  val emptySeq = Seq.empty[Int]                   //> emptySeq  : Seq[Int] = List()
  val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" ->3)
                                                  //> nonEmptyMap  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, t
                                                  //| wo -> 2, three -> 3)
  
  def seqToString2[T](seq:Seq[T]):String = seq match {
  	case head +: tail => s"($head +: ${seqToString2(tail)})"
  	case Nil => "(Nil)"
  }                                               //> seqToString2: [T](seq: Seq[T])String
  
  for(seq <- Seq(nonEmptySeq, emptySeq, nonEmptyMap.toSeq) ) {
  	println(seqToString2(seq))                //> (1 +: (2 +: (3 +: (4 +: (5 +: (Nil))))))
                                                  //| (Nil)
                                                  //| ((one,1) +: ((two,2) +: ((three,3) +: (Nil))))
  }
  
  def reverseSeqToString[T](i: Seq[T]) : String = i match {
    case prefix :+ end => reverseSeqToString(prefix) + s":+ $end"
    case Nil => "Nil"
  }                                               //> reverseSeqToString: [T](i: Seq[T])String
  
  for(seq <- Seq(nonEmptySeq, emptySeq, nonEmptyMap.toSeq) ) {
  	println(reverseSeqToString(seq))          //> Nil:+ 1:+ 2:+ 3:+ 4:+ 5
                                                  //| Nil
                                                  //| Nil:+ (one,1):+ (two,2):+ (three,3)
  }
}
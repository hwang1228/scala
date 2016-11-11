package day03

object type_check {
	def generalSize (x:Any) = x match {
		case s:String => s.length
		case m:Map[_,_] => m.size
		case _ => -1
	}                                         //> generalSize: (x: Any)Int
	
	generalSize("pyo")                        //> res0: Int = 3
	generalSize(Map(1 -> "일", 2 -> "이"))      //> res1: Int = 2
}
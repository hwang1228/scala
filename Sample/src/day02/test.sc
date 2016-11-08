object test2 {
	case class Point(x:Double=0.0, y:Double=0.0) {
		def shift(deltaX:Double = 0.0, deltaY:Double=0.0) =
			copy(x+deltaX, y+deltaY)
	}
	
	val p1 = new Point(x=3.3, y=5.5)          //> p1  : test2.Point = Point(3.3,5.5)
	p1.shift(1.1,2.5)                         //> res0: test2.Point = Point(4.4,8.0)
	p1.shift(1.1,2.5)                         //> res1: test2.Point = Point(4.4,8.0)
}
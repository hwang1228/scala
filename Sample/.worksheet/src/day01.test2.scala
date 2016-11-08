package day01

object test2 {
	case class Point(x:Double=0.0, y:Double=0.0) {
		def shift(deltaX:Double = 0.0, deltaY:Double=0.0) =
			copy(x+deltaX, y+deltaY)
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 
	
	val p1 = new Point(x=3.3, y=5.5);System.out.println("""p1  : day01.test2.Point = """ + $show(p1 ));$skip(19); val res$0 = 
	p1.shift(1.1,2.5);System.out.println("""res0: day01.test2.Point = """ + $show(res$0));$skip(19); val res$1 = 
	p1.shift(1.1,2.5);System.out.println("""res1: day01.test2.Point = """ + $show(res$1))}
}

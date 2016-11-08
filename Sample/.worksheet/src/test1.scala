object test1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(75); 
  
//  def m1[A](a:A, f:A=>String)=f(a)
  def m2[A](a:A)(f:A=>String)=f(a);System.out.println("""m2: [A](a: A)(f: A => String)String""");$skip(54); val res$0 = 
  
//  m1(100, i=>s"$i+$i")
  
  m2(100)(i=>s"$i+$i");System.out.println("""res0: String = """ + $show(res$0));$skip(42); 
  
  def m1[A](a:Int, f:Int=>String)=f(a);System.out.println("""m1: [A](a: Int, f: Int => String)String""");$skip(23); val res$1 = 
  m1(100, i=>s"$i+$i");System.out.println("""res1: String = """ + $show(res$1))}
}

object test1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
//  def m1[A](a:A, f:A=>String)=f(a)
  def m2[A](a:A)(f:A=>String)=f(a)                //> m2: [A](a: A)(f: A => String)String
  
//  m1(100, i=>s"$i+$i")
  
  m2(100)(i=>s"$i+$i")                            //> res0: String = 100+100
  
  def m1[A](a:Int, f:Int=>String)=f(a)            //> m1: [A](a: Int, f: Int => String)String
  m1(100, i=>s"$i+$i")                            //> res1: String = 100+100
}
package day03

object hoc2 {
	val numbers = List(1,2,3,4,5,6,7,8,9,10)  //> numbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	val test = numbers.partition(_ % 2 ==0)   //> test  : (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
                                                  //| 
	test._1                                   //> res0: List[Int] = List(2, 4, 6, 8, 10)
	test._2                                   //> res1: List[Int] = List(1, 3, 5, 7, 9)
	
	numbers.find((i: Int) => i > 5)           //> res2: Option[Int] = Some(6)
	
	numbers.drop(5)                           //> res3: List[Int] = List(6, 7, 8, 9, 10)
	numbers.dropWhile(_ % 2 != 0)             //> res4: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	numbers.foldLeft(0)((m: Int, n: Int) => m+n)
                                                  //> res5: Int = 55
	numbers.foldLeft(0){(m: Int, n: Int) => println("m: " + m + ",n: " + n); m+n}
                                                  //> m: 0,n: 1
                                                  //| m: 1,n: 2
                                                  //| m: 3,n: 3
                                                  //| m: 6,n: 4
                                                  //| m: 10,n: 5
                                                  //| m: 15,n: 6
                                                  //| m: 21,n: 7
                                                  //| m: 28,n: 8
                                                  //| m: 36,n: 9
                                                  //| m: 45,n: 10
                                                  //| res6: Int = 55
	/* logic 을 수행하여 우측 변수에 값을 넣어줌.*/
	numbers.foldRight(0){(m: Int, n: Int) => println("m: " + m + ",n: " + n); m+n}
                                                  //> m: 10,n: 0
                                                  //| m: 9,n: 10
                                                  //| m: 8,n: 19
                                                  //| m: 7,n: 27
                                                  //| m: 6,n: 34
                                                  //| m: 5,n: 40
                                                  //| m: 4,n: 45
                                                  //| m: 3,n: 49
                                                  //| m: 2,n: 52
                                                  //| m: 1,n: 54
                                                  //| res7: Int = 55
	
	List(List(1,2),List(3,4)).flatten         //> res8: List[Int] = List(1, 2, 3, 4)
	
	val nestedNumbers = List(List(1,2),List(3,4))
                                                  //> nestedNumbers  : List[List[Int]] = List(List(1, 2), List(3, 4))
	
	nestedNumbers.map((x : List[Int]) => x.map(_ * 2)).flatten
                                                  //> res9: List[Int] = List(2, 4, 6, 8)
	def ourMap(numbers : List[Int], fn: Int => Int):List[Int] = {
		numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
			fn(x) :: xs
		}
	}                                         //> ourMap: (numbers: List[Int], fn: Int => Int)List[Int]
	
	def timesTwo(x :Int) : Int = {
		return x*2
	}                                         //> timesTwo: (x: Int)Int
	ourMap(numbers, timesTwo)                 //> res10: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
	
}
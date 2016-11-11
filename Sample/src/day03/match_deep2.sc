package day03

object match_deep2 {
	case class Address(street:String, city:String, country:String)
	case class Person(name:String, age:Int, address:Address)
	
	val alice = Person("Alice", 25, Address("1 Scala Lane", "Chicago", "USA"))
                                                  //> alice  : day03.match_deep2.Person = Person(Alice,25,Address(1 Scala Lane,Chi
                                                  //| cago,USA))
	val bob = Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA"))
                                                  //> bob  : day03.match_deep2.Person = Person(Bob,29,Address(2 Java Ave.,Miami,US
                                                  //| A))
	val charlie = Person("Charlie", 32, Address("3 Python Ct.", "Boston", "USA"))
                                                  //> charlie  : day03.match_deep2.Person = Person(Charlie,32,Address(3 Python Ct.
                                                  //| ,Boston,USA))

	for(person <- Seq(alice, bob, charlie)) {
		person match {
			case p @ Person("Alice", 25, address) => println(s"Hi Alice! $p")
			case p @ Person("Bob", 29, a @ Address(street, city, country)) =>
				println(s"Hi ${p.name}! age ${p.age}, in ${a.city}")
			case p @ Person(name, age, _) =>
				println(s"Who are you, $age year-old person named $name? $p")
			
		}                                 //> Hi Alice! Person(Alice,25,Address(1 Scala Lane,Chicago,USA))
                                                  //| Hi Bob! age 29, in Miami
                                                  //| Who are you, 32 year-old person named Charlie? Person(Charlie,32,Address(3 P
                                                  //| ython Ct.,Boston,USA))
	
	}

}
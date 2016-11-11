// src/main/scala/progscala2/basicoop/PersonAuxConstructors2.sc
import progscala2.basicoop.Address

object test_EmployeeSubClass {
	val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
	val a2 = new Address("98765")
	
	case class Person2(
	  name: String,
	  age: Option[Int] = None,
	  address: Option[Address] = None)
	  
	class Employee(name: String, age: Option[Int], address: Option[Address], empid:Int) extends Person2(name, age, address) {
		
		
	}
	
	val emp = new Employee("Aname", Some(24), Some(a1), 24)
	println(emp.toString)
	
	new Person2("Buck Trends1")
	// 결과: Person2 = Person2(Buck Trends1,None,None)
	
	new Person2("Buck Trends2", Some(20), Some(a1))
	// 결과: Person2(Buck Trends2,Some(20),
	//           Some(Address(1 Scala Lane,Anytown,CA,98765)))
	
	new Person2("Buck Trends3", Some(20))
	// 결과: Person2(Buck Trends3,Some(20),None)
	
	new Person2("Buck Trends4", address = Some(a2))
	// 결과: Person2(Buck Trends4,None,
	//           Some(Address([unknown],Anytown,CA,98765)))
	
	println(new Person2("Buck Trends4", address = Some(a2)).toString)
}
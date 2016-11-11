package day04

object vending_test {
	sealed trait Drink
	
	trait SoftDrink extends Drink
	class Cola extends SoftDrink
	class TonicWater extends SoftDrink
	
	trait Juice extends Drink
	class OrangeJuice extends Juice
	class AppleJuice extends Juice
	
	class VendingMachine[+A] {
	  
	}
	
	object DrinkMain extends App {
	  def install(softDrinkVM : VendingMachine[SoftDrink]) : Unit = {
	     println("Vending Machine ToString : " + softDrinkVM.toString)
	  }
	  
	  install(new VendingMachine[Cola])
	  install(new VendingMachine[TonicWater])
	  
	  install(new VendingMachine[SoftDrink])
	  //error
	//  install(new VendingMachine[Drink])
	//  install(new VendingMachine[AppleJuice])
	  
	  
	}
}
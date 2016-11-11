// src/main/scala/progscala2/traits/ui2/click-count-observer.sc
import day05._
import day05._

object test_click {
// Button 내에서 'click'을 오버라이딩할 필요는 없다.
	val button = new Button("Click Me!") with ObservableClicks
	
	class ClickCountObserver extends Observer[Clickable] {
	  var count = 0
	  def receiveUpdate(state: Clickable): Unit = count += 1
	}
	
	val bco1 = new ClickCountObserver
	val bco2 = new ClickCountObserver
	
	button addObserver bco1
	button addObserver bco2
	
	(1 to 5) foreach (_ => button.click())
	
	assert(bco1.count == 5, s"bco1.count ${bco1.count} != 5")
	assert(bco2.count == 5, s"bco2.count ${bco2.count} != 5")
	println("Success!")
}
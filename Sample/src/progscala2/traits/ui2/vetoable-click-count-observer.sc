// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc
import progscala2.traits.ui2._
import progscala2.traits.observer._
object test_ui2_veo {
// Button 내에서 'click'을 오버라이딩할 필요는 없다.
val button =
    new Button("Click Me!") with ObservableClicks with VetoableClicks {
  override val maxAllowed = 2                                   // <1>
}                                                 //> button  : progscala2.traits.ui2.Button with progscala2.traits.ui2.Observable
                                                  //| Clicks with progscala2.traits.ui2.VetoableClicks = test_ui2_veo$$anonfun$mai
                                                  //| n$1$$anon$1@c2e1f26

class ClickCountObserver extends Observer[Clickable] {          // <2>
  var count = 0
  def receiveUpdate(state: Clickable): Unit = count += 1
}

val bco1 = new ClickCountObserver                 //> bco1  : test_ui2_veo.ClickCountObserver = test_ui2_veo$$anonfun$main$1$Click
                                                  //| CountObserver$1@511baa65
val bco2 = new ClickCountObserver                 //> bco2  : test_ui2_veo.ClickCountObserver = test_ui2_veo$$anonfun$main$1$Click
                                                  //| CountObserver$1@340f438e

button addObserver bco1
button addObserver bco2

(1 to 5) foreach (_ => button.click())

assert(bco1.count == 2, s"bco1.count ${bco1.count} != 2")       // <3>
assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2")
println("Success!")                               //> Success!
}
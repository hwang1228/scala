// src/main/scala/progscala2/traits/ui2/ObservableClicks.scala
package day05
import day05._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {        // <1>
    super.click()
    notifyObservers(this)
  }
}

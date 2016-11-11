// src/main/scala/progscala2/traits/ui2/Button.scala
package day05
import day05.Widget

class Button1(val label: String) extends Widget with Clickable {

  protected def updateUI(): Unit = { /* GUI 모양을 변경하는 논리 */ }
}

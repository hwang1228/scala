// src/main/scala/progscala2/rounding/call-by-name.sc
object test {

@annotation.tailrec;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(410);                                                   // <1>
def continue(conditional: => Boolean)(body: => Unit) {               // <2>
  if (conditional) {                                                 // <3>
    body                                                             // <4>
    continue(conditional)(body)
  }
};System.out.println("""continue: (conditional: => Boolean)(body: => Unit)Unit""");$skip(77); 

var count = 0;System.out.println("""count  : Int = """ + $show(count ));$skip(61);                                                         // <5>
continue(count < 5) {
  println(s"at $count")
  count += 1
}}
}

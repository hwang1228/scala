package day01

class Upper {
  //primary Constructor
  def Upper(strings : String*) : Seq[String] = { // * : 가변인자
    strings.map((s:String) => s.toUpperCase()) //lamda
  }
}

// src/main/scala/progscala2/rounding/enumeration.sc

object Breed extends Enumeration {
  type Breed = Value;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 
  val doberman = Value("Doberman Pinscher");System.out.println("""doberman  : Breed.Value = """ + $show(doberman ));$skip(44); 
  val yorkie   = Value("Yorkshire Terrier");System.out.println("""yorkie  : Breed.Value = """ + $show(yorkie ));$skip(43); 
  val scottie  = Value("Scottish Terrier");System.out.println("""scottie  : Breed.Value = """ + $show(scottie ));$skip(37); 
  val dane     = Value("Great Dane");System.out.println("""dane  : Breed.Value = """ + $show(dane ));$skip(47); 
  val portie   = Value("Portuguese Water Dog");System.out.println("""portie  : Breed.Value = """ + $show(portie ))}
}
import Breed._

// 품종과 품종의 ID 목록을 표시한다.
println("ID\tBreed")
for (breed <- Breed.values) println(s"${breed.id}\t$breed")

// 테리어 품종의 목록을 표시한다.
println("\nJust Terriers:")
Breed.values filter (_.toString.endsWith("Terrier")) foreach println

def isTerrier(b: Breed) = b.toString.endsWith("Terrier")

println("\nTerriers Again??")
Breed.values filter isTerrier foreach println

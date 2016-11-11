package day04

sealed trait Item

class PlasticItem extends Item
class PlasticBottle extends PlasticItem

class PaperItem extends Item
class Newspaper extends PaperItem

class GarbageCan[-A] {
  
}

object GarbageMain extends App {
  def setGarbageCanForPlastic(gc : GarbageCan[PlasticItem]):Unit = {
    println("setGarbageCanForPlastic : " + gc.toString)
  }
  
  setGarbageCanForPlastic(new GarbageCan[PlasticItem])
  setGarbageCanForPlastic(new GarbageCan[Item])
  //error
//  setGarbageCanForPlastic(new GarbageCan[PaperItem])
//  setGarbageCanForPlastic(new GarbageCan[Newspaper])
}
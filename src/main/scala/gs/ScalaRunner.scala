package main.scala.gs

object ScalaRunner extends App {

  val higherOne = new HigherOne
  val lowerOne = new LowerOne

  println("Hey you!" +
    "\nHere is the higher-message:\n" + higherOne.centralMethod +
    "\nHere is the lower-message:\n" + lowerOne.centralMethod)

}

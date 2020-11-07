package main.scala.gs

class HigherOne {

  val myName: String = this.getClass.getSimpleName

  def centralMethod: String = firstMethod + " at " + secondMethod + constantMethod

  final def constantMethod: String = " (done)."

  def firstMethod: String = myName

  def secondMethod: String = java.time.LocalTime.now().toString

}

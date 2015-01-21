package nl.ibridge.scalatratest.model

sealed trait Key {
  def name: String
  override def toString: String = name
}

case object Functie extends Key {
  val name = "Functie"
}
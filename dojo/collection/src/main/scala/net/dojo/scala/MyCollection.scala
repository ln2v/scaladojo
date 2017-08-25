package net.dojo.scala

class MyCollection {
  
  def hello: String = "Hello, Knowit!"

  //  0) Bookmark http://www.scala-lang.org/api/2.11.8/index.html#scala.collection.immutable.List
  
  //  1) do we have underage people in the list?

  //  2) how many people named Anders do we have?

  //  3) make a new list with all the places people live in, with no duplicates

  //  4) Do we have at least one with a car and living in Oslo?

  //  5) make a list with every car owner

  //  6) make a car list withour electric cars

  //  7) make a new map grouping people by their age, where age is the key and the list of ppl with that age the value

  //  8) find the car model of the youngest Anders
  //  9) make everyone one year older and reverse the order of the list
  // 10) find the car model of the youngest Anders, is it the same as before?

  // 11) assign everyone an incrementing number

  // 12) use zip and padTo to make your custom zipAll
  
}

object MyCollection {
  val allThePeople = List(Person("Anders", 22, "Oslo"))
  val allTheCars = List()
}


case class Person(name: String, age: Int, residence: String, carLicense: Option[String] = None)
case class Car(model: String, color: String, licenseNumber: String)

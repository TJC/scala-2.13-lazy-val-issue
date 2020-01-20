package example

case class MyThing(name: String, value: Int)

// Changing `thingCons` to be a val parameter fixes the error
class LazyConstructors(thingCons: (String) => MyThing) {
  val name = "example"
  lazy val thing: MyThing = thingCons(name)

  def callMe = thing.name
}

object LazyConstructors {
  def defaultCons: String => MyThing = { n => MyThing(n, n.length) }
}

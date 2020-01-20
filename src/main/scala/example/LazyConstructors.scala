package example

case class MyThing(name: String, value: Int)

class LazyConstructors(thingCons: (String) => MyThing = LazyConstructors.defaultCons) {
  val name = "example"
  lazy val thing: MyThing = thingCons(name)

  def callMe = thing.name
}

object LazyConstructors {
  def defaultCons: String => MyThing = { n => MyThing(n, n.length) }
}

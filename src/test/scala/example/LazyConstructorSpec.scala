package example

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class LazyConstructorsSpec extends AnyFunSpec with Matchers {
  describe("lazy constructor example") {
    it("should work with default") {
      val lc = new LazyConstructors(LazyConstructors.defaultCons)
      lc.callMe should be ("example")
    }

    it("should work with override") {
      val consOverride = (n: String) => MyThing(s"$n spec", 999)
      val lc = new LazyConstructors(consOverride)

      lc.callMe should be ("example spec")
    }
  }
}

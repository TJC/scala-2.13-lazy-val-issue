Demonstrate problem with lazy vals and Scala 2.13 and SBT

Running `sbt test` in this repo, at least on JDK 11, results in the error:

```
java.lang.IllegalAccessError: Update to non-static final field example.LazyConstructors.thingCons attempted from a different method (thing$lzycompute) than the initializer method <init>
   at example.LazyConstructors.thing$lzycompute(LazyConstructors.scala:7)
   at example.LazyConstructors.thing(LazyConstructors.scala:7)
   at example.LazyConstructors.callMe(LazyConstructors.scala:9)
```

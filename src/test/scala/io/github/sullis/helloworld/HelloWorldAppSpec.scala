package io.github.sullis.helloworld

class HelloWorldAppSpec extends AbstractSpec {
  "Application" should {
    "happy path OK" in {
      HelloWorldApp.main(Array("aaa", "bbb"))
    }
  }
}

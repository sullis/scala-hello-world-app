package io.github.sullis.helloworld

object HelloWorldApp extends App {
  args.foreach { arg =>
    System.out.println(s"arg: ${arg}")
  }
  System.out.println("Hello world")
}

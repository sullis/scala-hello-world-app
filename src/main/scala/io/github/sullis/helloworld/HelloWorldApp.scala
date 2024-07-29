package io.github.sullis.helloworld

object HelloWorldApp extends App {

  System.out.println("Hello world")

  if (args != null) {
    args.foreach { arg =>
      System.out.println(s"arg: ${arg}")
    }
  }
}

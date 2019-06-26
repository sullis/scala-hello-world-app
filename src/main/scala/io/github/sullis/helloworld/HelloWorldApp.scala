package io.github.sullis.helloworld

object HelloWorldApp extends App {
  System.out.println(s"Args: ${args.toSeq}")
  System.out.println("Hello world")
}

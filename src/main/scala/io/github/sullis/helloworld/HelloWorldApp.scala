package io.github.sullis.helloworld

object HelloWorldApp extends App {

  System.out.println("Hello world")

  printArgs()

  def printArgs(): Unit = {

    args.foreach { arg =>
      System.out.println(s"arg: ${arg}")
    }
  }
}

package fr.blackbird.demo

class DemoApp {

  def cube(x: Int): Int = {
    x * x * x
  }

  def multiply(x: Int, y: Int): Int = {
    if (x == 0 || y == 0) {
      0
    } else {
      x * y
    }
  }
}

fun main() {
  val age = 20
  val layers = 5
  printCakeCandles(age)
  printCakeTop(age)
  printCakeBottom(age, layers)
  
}

fun printCakeCandles(age: Int) {
  repeat(age) {
    print(",")
  }
  println()
  
  repeat(age) {
    print("|")
  }
  println()
}

fun printCakeTop(age: Int) {
  repeat(age + 2) {
    print("=")
  }
  println()
}

fun printCakeBottom(age: Int, layers: Int) {
  if (layers <= 0) {
    println("The number of layers must be greater than zero.")
    return
  }
  repeat(layers) {
    repeat(age + 2) {
      print("@")
    }
    println()
  }
}
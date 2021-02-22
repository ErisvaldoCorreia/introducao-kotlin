/**
 * Primeiros passos com Kotlin
 * Erisvaldo Correia 
 */

fun main() {
    
    var z = calculate(10, 5){a, b -> a*b}
    println(z)
    
    var word = "amora"
    println("${word.myExtFun()}")
    
}

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int {
    return operation(n1, n2)
}

fun String.myExtFun() = 
    this[(0..this.length-1).random()].toUpperCase()
    

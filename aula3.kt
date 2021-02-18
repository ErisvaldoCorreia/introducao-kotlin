/**
 * Primeiros estudos com Kotlin
 * Erisvaldo Correia
 */



fun main() {
    
    val myNumbers = listOf(2, 4, 9, 10, 20)

    // (inicio..fim) declara um range de valores
    // random() recupera um valor aleatório
    var choice = (1..30).random()

    println(choice in myNumbers)
    println(choice)

    println(choice > 10)
    println(choice + 20)

    // in verifica se um determinado valor esta presente em
    // uma lista ou um range de dados.
    println(12 in (0..10))
    println(10 in (0..20))
    
}

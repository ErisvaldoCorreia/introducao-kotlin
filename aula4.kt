/**
 * Primeiros estudos com Kotlin 
 * Erisvaldo Correia
 */

fun main() {
    
    val word = "Ola mundo!"
    println(word[0]) // igual a word.first()
    println(word[word.length-1]) // igual a word.last()
    
    val first = "Primeira frase"
    val second = "segunda frase"
    println("$first está normal, e ${second.toUpperCase()} esta agora toda em upperCase")
    
}

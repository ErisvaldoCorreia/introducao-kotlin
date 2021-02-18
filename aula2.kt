/**
 * Primeiros estudos com Kotlin
 * Erisvaldo Correia
 */

// const só podem ser declaradas fora de funções
const val CONST_GLOBAL = 23

fun main() {
    
    // declara inicialializando a variavel
    // infere o tipo especifico permanente
    var implicitType = 22
    println(implicitType)
    // tentar aplicar o valor null a primeira variavel dispara erro!
    
    // declara variavel inferindo tipo inteiro
    // permite a nullabilidade do valor
    var notImplicitValue:Int?
    notImplicitValue = 24
    println(notImplicitValue)
    
    notImplicitValue = null
    println(notImplicitValue)
    
    val imutableValue = "não pode ser alterado"
    // variaveis declaradas como val não podem ter alteração
    
}
/**
 * Primeiros estudos com Kotlin 
 * Erisvaldo Correia
 */

fun main() {
    println(getName("Erisvaldo", "Correia"))
    println(getNameSingle("Novo", "Nome"))
}

// Declaramos uma função passando os parametros (se houver)
// e sua tipagem. bem como defininos o tipo de retorno da função
// se for void, podemos omitir a tipagem
fun getName(name:String, lastName:String):String {
    return "$name $lastName"
}

// No caso de uma função simples de retorno direto, podemos usar a 
// inferencia de tipo na função, omitindo o return e as chaves fazendo uma
// single-line function
fun getNameSingle(name:String, lastName:String) = "$name $lastName"

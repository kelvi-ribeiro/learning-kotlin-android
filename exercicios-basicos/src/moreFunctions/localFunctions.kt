package moreFunctions

import java.text.SimpleDateFormat
import java.util.*

/*
    Funções internas: São funções dentro de funções que só ficam acessíveis
    dentro da função pai, e caso tenha uma função externa com o mesmo nome
    que a interna e seja desajado executar a função externa, usamos a palavra
    reservada deeper.${functionName}
*/

fun log(str: String) {
    println(str)
}

fun top() {
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH::mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }
    log("Início ")
    // deeper.log("aaa")

    val interval = 1..1000000
    var sum: Double = 0.0
    for (i in interval) {
        sum += i * 2 * 1
    }
    log("Fim")
}

fun main() {
    top()
    log("Alora")
}
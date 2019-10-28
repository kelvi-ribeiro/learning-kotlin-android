fun operacao(a: Int, b: Int, c: String): Int {
    return when (c) {
        "soma" -> a + b

        "subtração" -> a - b

        else -> 0
    }

    when {
        a > 0 && b > 0 -> println("Variáveis maiores que zero")
        else -> println("Variáveis maiores do que zero")
    }
    // Range - Intervalo de valores
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
}

fun main() {
    operacao(10, 20, "soma")
    operacao(10, 20, "subtração")
    operacao(10, 20, "divisão")
}
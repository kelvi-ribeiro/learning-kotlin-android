package moreFunctions

/*
    High Order Functions: São funções que podem receber outras funções como parâmetro,
    abaixo tem o exemplo de como isso funciona
*/


fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
}


fun main() {
    val list = listOf(1, 2, 3, 4)
    list.forEach({ println(it) })

    list.paraCada { println(it) }

    val strlist = listOf("a", "b")

    strlist.paraCada { println(it) }

    val map = mapOf(Pair("Paris", "França"))
    map.values.paraCada{ println(it)}

    operator(1, 2, ::sum)

    operator(1, 2, ::multiply)
}
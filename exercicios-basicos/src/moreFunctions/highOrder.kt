package moreFunctions

/*
    Uma expressão lambda é uma maneira concisa de declarar uma função ou subrotina. Num mundo orientado a objetos, é bastante similar a um objeto que tem um método só.

    Existem duas vantagens principais de se usar uma expressão lambda ao invés de uma função ou método definida separadamante:

    1. Simplicidade. Para que dar um nome a algo que só vai ser usado uma vez mesmo?
    2. Escopo léxico. Funções lambda podem automaticamente usar todas as variáveis do escopo atual.*/


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
    map.values.paraCada { println(it) }

    operator(1, 2, ::sum)

    operator(1, 2, ::multiply)

    operator(1, 2, { x: Int, y: Int -> x - y })

    val l1 = { x: Int, y: Int -> x - y }

    operator(1, 2, l1)


    val l2: (Int, Int) -> Int = { u, i -> u + i }

    operator(1, 2, l2)


}
package moreFunctions

/*
    infix function: Com a palavra reservada infix function, é possível
    executar funções com uma legibilidade muito maior que o normal.
    Esse recurso só pode ser usado com funções de um só parâmetro
*/

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main() {
    10.isHalfOf(20)
    30.isHalfOf(60)

    5 isHalfOf 5

    val p1 = Person("Kelvi")
    println(p1 isName "Kelvii")

}
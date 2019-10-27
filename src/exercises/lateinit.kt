package exercises

/*
    lateinit: É usado quando não se desejado criar uma variável com um valor, uma variável inicializada com
    lateinit sempre deve ser declarada com var
 */

class Pessoa1() {
    lateinit  var nome: String

    fun geradorNome() {
        nome = "aaaa"
    }
}

fun main() {
    val p = Pessoa1()
    p.geradorNome()
    println(p.nome)
}

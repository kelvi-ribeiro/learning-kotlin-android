package exercises

/*
    init: É executado independente de quantidade construtores e pode ser usado para
    atribuir uma variável da classe pai como visto nesse exemplo na classe Cachorro
 */

abstract class Mamifero(var nome: String) {

    var peso = 0f

    abstract fun falar()
    fun dormir() {
        println("Estou dormindo")
    }
}

class Cachorro(nome: String, peso:Float) : Mamifero(nome) {
    init {
        this.peso = peso
    }
    override fun falar() {
        println("au au")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }
}

fun main() {
    Cachorro("Bold", 80f).dormir()
}
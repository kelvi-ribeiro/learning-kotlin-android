package exercises

/*
    Para que uma classe seja herdada por outra, precisamos que a classe
    pai tenha a palavra reservada de open, além disso, na classe filha, precisamos
    chamar o construtor da classe pai passando os parâmetros
 */

open class Maquina(val marca: String){
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca){
    fun ligar(){
        println("Ligando")
    }
    fun operacoes(){
        println("Operações")
    }
}

fun main() {
    val c = Computador("ASUS", 10)
    with(c) {
        minhaMarca()
        ligar()
        operacoes()
    }
}
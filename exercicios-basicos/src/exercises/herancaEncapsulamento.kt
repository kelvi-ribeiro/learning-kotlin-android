package exercises

/*
    Herança: Para que uma classe seja herdada por outra, precisamos que a classe
    pai tenha a palavra reservada de open, além disso, na classe filha, precisamos
    chamar o construtor da classe pai passando os parâmetros
    Overide: Para sobreescrever métodos no Kotlin, é necessário a palavra reservada open

    Overload: É quando se tem um método com assinatura diferente do pai
    Assinatura: É a quantidade de parâmetros e seus respectivos tipos de um método
 */

open class Maquina(val marca: String){
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca){
    override fun minhaMarca() {
        println("Estou reescrevendo minha $marca")
    }
    // Sobrecarga
    fun overload(i: Int) = println("Overload 1")

    fun overload(s: String) = println("Overload 1")

    fun overload(i: Int, b:Boolean) = println("Overload 1")

    fun ligar(){
        println("Ligando")
    }
    fun operacoes(){
        println("Operações")
    }
    private fun validate(){
        println("Validando...")
    }
}

fun main() {
    val c = Computador("ASUS", 10)
    with(c) {
        minhaMarca()
        ligar()
        operacoes()
        overload(10)
        overload(10, true)
        overload("Olá")
    }
}

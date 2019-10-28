package exercises

/*
    interface: Define um contrato, a principal diferença entre uma classe
    abstrata e uma interface, é que a interface não pode possuir estado, ou seja
    não pode um atributo com atribuição de valor
    Uma mudança recente fez que interfaces pudessem conter métodos com corpo e
    não a assinatura do mesmo.
    Conceito de Herança/Interface: Uma classe pode herdar somente uma classe, mas pode ter
    várias interfaces
 */

interface MaquinaI {

    var peso: Float

    fun ligar()

    fun desligar() {
        println("Off")
    }
}

class ComputadorC(override var peso: Float) : MaquinaI {
    override fun ligar() {

    }

}

interface interface1 {
    fun ola() {
        println("interface1")
    }
}

interface interface2 {
    fun ola() {
        println("interface2")
    }
}

class ImplementaIntercae : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }
}


fun main() {

}
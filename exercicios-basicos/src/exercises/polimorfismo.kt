package exercises

/*
    init: É executado independente de quantidade construtores e pode ser usado para
    atribuir uma variável da classe pai como visto nesse exemplo na classe Cachorro
 */

interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("Bônus: 500")
    }
}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("Bônus: 200")
    }
}

class Analista : Funcionario {
    override fun calculaBonus() {
        println("Bônus: 450")
    }

}


fun calculo(funcionario: Funcionario) {
    funcionario.calculaBonus()
}

fun main() {
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()
    val f3: Funcionario = Analista()
    calculo(f1)
    calculo(f2)
    calculo(f3)
}

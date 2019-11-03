package moreClasses

import java.lang.Exception

/*
 Field: É a palavra reservarda dentro de um contexto de get e set
 e serve para fazer uma atribuição(set) ou retorno(get) da variável
 em questão, pois usar o this diretamenta causa um loop chamando o método
 até estourar alguma exceção
 */

class Car(val model: String, val maxSpeed: Int) {
    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior que a permitida")
            } else {
                field = value
            }
        }
        get() {
            return field
        }
}

fun main() {
    val c1 = Car("Test", 200)
    c1.currentSpeed = 50
    println(c1.currentSpeed)


}
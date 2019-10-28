package exercises

/*
    Companion object: Um objeto que não necessariamente tem um nome e serve para criar atributos,
    métodos que irão fica num escopo num estático. Em outras palavras,
    os recursos da classe que são declaradas dentro um companion object ficam
    no escopo da classe e não de uma instância da classe, pode-se criar hieraraquias, mas o nome é necessário
    para isso. Também é possível criar singletons com o mesmo
    Object: Tem os mesmo recursos de companion object, mas precisa ter um nome associado e
    com ele, podemos fazer uma hieraraquia de objets. Também é possível criar singletons com o mesmo

 */

class Constants private  constructor() /* Fechando um construtor, pois nesse caso, não precisa */ {
    companion object {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um método estático...")
        }
    }
    object VENDAS {
        val TABLE = "Vendas"

        object COLUNAS {
            val ID = "Id"
        }
    }
}

fun main() {
    println(Constants.TABLE)
    Constants.teste()
    println(Constants.VENDAS.COLUNAS.ID)
}
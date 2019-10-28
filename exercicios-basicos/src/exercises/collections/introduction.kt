package exercises.collections

fun main(args: Array<String>) {

    /*
    Com o listOf, criamos lista imutáveis, ou seja, não é possível adicionar elementos ou
    remover elementos na lista.

    Com o mutableListOf, criamos uma lista mutável, sendo possível remover ou adicionar elements

    Com o arrayListOf, ganhamos um array exatamente igual ao ArrayList do Java, assim ganhando
    todos os métodos do mesmo

    Com o setOf, ganhamos um array imutável filho de Set do Java, no qual não permite elementos duplicados.

    Com o setOf, ganhamos um array mutável filho de Set do Java, no qual não permite elementos duplicados.

    Com o hashMapOf, se ganha um array do tipo genérico do HashMap, pode ser usado para fazer um estrutura de chave e valor
    como no exemplo abaixo

    mapOf é uma lista do tipo igual ao hashMapOf, imutável

    mutableMapOf é uma lista do tipo igual ao hashMapOf, mutável

    */

    // List - array, Set, Hashmap
    val li = listOf("Madrid", "São Paulo", "Berlim")
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlim")
    val a1 = arrayListOf("Madrid", "São Paulo", "Berlim")

    val s1 = setOf("Madrid", "São Paulo", "Berlim", "Berlim")
    val s2 = mutableSetOf("Madrid", "São Paulo", "Berlim", "Berlim")

    val h1 = hashMapOf<String, String>(Pair("key","value"), Pair("França", "Paris"))

    val m1 = mapOf<String, String>(Pair("key","value"), Pair("França", "Paris"))
    val m2 = mutableMapOf<String, String>(Pair("key","value"), Pair("França", "Paris"))

    println(h1.entries)
    println(h1["França"])
}
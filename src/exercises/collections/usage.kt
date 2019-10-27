package exercises.collections

/*
    O método count de uma lista  dá o número de elementos

    O método sumByDouble, dado um conjunto de valores no predicado, nos retorna
    o a soma, os valores devem ser dobule

    O método sumBy, dado um conjunto de valores no predicado, nos retorna
    o a soma, os valores devem ser Int

    O método take, com a quantidade de elementos como parâmetro
    nos retorna os primeiros $quantidadeElementos de um array

    O método withIndex usado um for serve para além de ter o valor
    daquele elemento de array numa interação, também seja possível pegar o index

    a palavra reservada it é o elemento default a ser interado dentro de um escopo de interação de uma lista
    como forEach, filter, map e etc...
 */

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun hasIngredient(list: List<Ingredients>, name: String):Boolean{
    return list.filter { it.name === name }.any()
}

fun main(args: Array<String>) {
    val data = listOf(
        Food(
            "Lazanha", 1200.0,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjericão", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food(
            "Hamburguer", 2000.0,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburguer", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )

    // --------------------------------- Usage parte 1 ---------------------------------

    // Tenho receitas na lista ?

    println("Tenho receitas ? ${if (data.any()) "Sim" else "Não"}.")

    // Quantas receitas tenho na coleção ?
    println("Tenho ${data.count()} receitas;")

    // Qual a primeira e última receita ?
    println("A primeira receita é: ${data.first().name}")
    println("A última receita é: ${data.last().name}")

    // Qual a soma de calories
    val sumCaloreis = data.sumByDouble { it.calories }
    println("A soma de calorias é: $sumCaloreis")
    // listOf(1,2,3,4,5).sum() / Exemplo de uso de sum() de array do tipo simples


    // Me dê as duas primeiras receitas!
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()){
        println("${x.index + 1} - ${x.value.name}")
    }

    // --------------------------------- Usage parte 2 ---------------------------------

    // Sei como fazer panqueca ? e sushi ?

    val knowPancake = data.filter { it.name == "Panqueca" }.any()

    val knowSushi = data.filter { it.name == "Shush" }.any()
    println("Sei fazer panqueca ? ${if(knowPancake) "Sim" else "Não"}")

    println("Sei fazer sushi ? ${if(knowSushi) "Sim" else "Não"}")

    // Quais são as comidas com mais de 500 calorias ?
    val more500Calories = data.filter { it.calories > 500 }.forEach{ println(it.name)}


    // Par(chave, valor) de comidas com mais de 500 calorias(name, calories)

    data.filter { it.calories > 500 }
        .map { Pair(it.name, it.calories) }
        .forEach{ println("${it.first}: ${it.second} calorias")}

    // Quais das receitas possui farinha como ingrediente ? minha solução
    // data.filter { it.ingredients.filter { it.name == "Farinha" }.any()}
    //    .forEach{ println("A receita de ${it.name} possui farinha")}

    // Quais das receitas possui farinha como ingrediente ? solução do professor
    val result = data.filter { hasIngredient(it.ingredients, "Farinha") }.forEach{println(it.name)}

}
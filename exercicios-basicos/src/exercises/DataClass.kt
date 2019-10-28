package exercises

/*
     ---------- Aula 59. Data class ----------

        O data class serve muito bem para agregar um conjunto de dados, num jeito mais prático, variáveis,
      pois ao invés de ter funções com vários parâmetros, pode-se ter um único parâmetro, sendo a data class
      com todos os parâmetros declarados como atributos.

      Além disso, com o data class, ganhamos um toString que é muito útil para transição desses dados.

      Outro benefício bem claro, é que por padrão, quando dois objetos de uma mesma classe comum são comparados, o que
      vai ser comparado vai ser a posição da memória desses dois objetos, já com o data class, já ganhamos um comparador no
      qual é comporado os valores de um objeto e não o sua posição na memória.

      Também ganhamos por default um método de copy() que é possível copiar um objeto A para um objeto B

 */
class Quadrado(val area: Float)

data class Triangulo(val area: Float)

fun main() {
  val q1 = Quadrado(10f)
  val q2 = Quadrado(15f)

  val t1 = Triangulo(30f)
  val t2 = Triangulo(30f)

  val t3 = t2.copy()

  // Comparando os objetos e entendendo a diferença de comparar classes comumns e data class
  println(q1 == q2)
  println(t1 == t2)
  // Comparando o hashCode de cada objeto e entendendo a diferença
  println(q1.hashCode())
  println(q2.hashCode())
  println(t1.hashCode())
  println(t2.hashCode())
  println(t3.hashCode())
}
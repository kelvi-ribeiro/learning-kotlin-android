package exercises

/*
     Com o with, se tivermos alguma variável que seja desejado fazer
     várias interações com ela, chamar seus métodos por ex, podemos
     fazer isso o with de uma forma muito mais simples, sem ter que
     repetir a varíavel a cada instriução
 */

 class Heroi(var nome: String) {

  fun correr(){}

  fun nadar(){}

  fun voar(){}
}

fun main() {
  var h = Heroi("Flash")
  with(h){
      correr()
      nadar()
      voar()
  }
}



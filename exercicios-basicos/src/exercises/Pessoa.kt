package exercises

class Pessoa(var nome: String) {

  var profissao: String? = null
  get() {
    println("Get foi chamado")
    return field

  }
  set(value) {
    println("set foi chamado")
    field  = value
  }
}

fun main() {
  var antonio = Pessoa("Antônio")
  antonio.profissao
  antonio.profissao = "Programador"
}
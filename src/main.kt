class Pessoa1


class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String) {

  var anoNascimento: Int? = null

  constructor(nome: String, anoNascimento: Int) : this(nome) {
    this.anoNascimento = anoNascimento
  }

  fun saudacao() {
    println("Olá, meu nome é $nome e sou do ano de $anoNascimento")
  }
}


fun main() {
  val kelvi: Pessoa3 = Pessoa3("Kelvi", 1997)
  val thais: Pessoa3 = Pessoa3("Thaís")
  thais.saudacao()
}
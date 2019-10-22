class Pessoa1



class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(private var nome: String, private val anoNascimento: Int) {

    fun saudacao(){
      println("Olá, meu nome é $nome e sou do ano de $anoNascimento")
    }
}


fun main() {
      val kelvi:Pessoa3 = Pessoa3("Kelvi", 1997)
      kelvi.()
}
fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun main() {
    endereco(cidade = "Campinas" , estado = "São Paulo", cep = "13")
    endereco(rua = "Rua dos Marujos", cidade = "Belford Roxo" , estado = "Rio de Janeiro", cep = "26120-180")
}
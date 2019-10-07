// Unit === void

fun calculaBonus(a: Int, b: Int, c: Int){
    println("O bônus é ${a + b * c}")
}

fun hello(nome: String):String {
    return "Olá, $nome"
}

fun main() {
    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a,b,c)

    println(hello("Kelvi"))
}
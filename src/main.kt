fun calculaBonus(cargo: String, salario:Float):Float {
    // Gerente Júnior, Gerente Sênior, Coordenador

    return if(cargo == "Coordenador"){
        salario * 1.2f
    } else if (cargo === "Gerente Júnior") {
        salario * 1.5f
    } else {
        salario * 2
    }
}
// if - else
fun maiorDeIdade(idade: Int) = idade >= 18

fun main() {
    val valor = 10
    val str = if (valor == 10) "Sim" else "Não"
    println(str)
    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Júnior", 1000f))
    println(calculaBonus("Gerente Sênior", 1000f))

}
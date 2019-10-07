fun calculaBonus(cargo: String, salario:Float):Float {
    // Gerente Júnior, Gerente Sênior, Coordenador

    var bonus:Float = salario
    if(cargo == "Coordenador"){
        bonus *=   1.2f
    } else if (cargo === "Gerente Júnior") {
        bonus *= 1.5f
    } else {
        bonus *= 2
    }
    return bonus

}
// if - else
fun maiorDeIdade(idade: Int) = idade >= 18

fun main() {
    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Júnior", 1000f))
    println(calculaBonus("Gerente Sênior", 1000f))

}
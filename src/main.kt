fun media(vararg  notas:Float){
    if(notas.isNotEmpty()){
        var soma = 0f
        for(nota in notas){
            soma += nota
        }
        println("A média é ${soma / notas.size}")
    }
}

fun <T> media(vararg valores: T){
    for(valor in valores){
        println(valor)
    }
}


fun main() {
    //media(9f,9f)
    //media(8f,7f, 5f, 8f)
    media(8,"Teste", false, 8f)
}
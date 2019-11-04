package moreFunctions

/*

    Função anônima: São funções que geralmente só tem um uso muito específico e não seja
    desejado dar um nome, apenas passar a função para uma execução.

    Diferente do Lambda conseguimos executar mais de uma instrução com o uso de
    funções anônimas.

*/
fun operator1(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}


fun main() {
    operator1(1, 2, fun(n1: Int, n2: Int): Int {
        val sum = n1 + n2
        return sum
    })
}
import java.lang.NumberFormatException

fun main() {
    try {
        println("aaa".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número")
    } catch (e: Exception) {
        println("Algo de errado aconteceu")
    } finally {
        println("Finnaly")
    }

}
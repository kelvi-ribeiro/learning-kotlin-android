import java.lang.NumberFormatException

fun main() {
    val str: String? = null
    println(str?.length) // Assume ao Kotlin que não pode dar erro. O erro não é disparado

    println(str!!.length) // Assume ao Kotlin que pode dar erro. O erro é disparado

}
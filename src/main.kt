fun main() {
    val frase = "Kotlin é uma linguagem"
    val caracteristica = " Show"

    // println("$frase$caracteristica")

    val str = """dsdasdasd
        |adadadasdasdas
        |dasdadasdasdasd
        |sdasdasdasda
        |
        |dadasdasdasd
        |
        |adadasd
    """.trimMargin()

    println(str)

     println("$frase ${caracteristica.length}")
}
package moreClasses

import java.lang.Exception

/*
 Nested Class: Classe interna, e precisamos declarar a palavrada
 revervada inner para conseguir fazer isso
 */

class Computer(val processorModel: String) {
    inner class Memory {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return 70
        }
    }
}

fun main() {
    val m1 = Computer("Intel").Memory()
    m1.getMemoryLevel()
}
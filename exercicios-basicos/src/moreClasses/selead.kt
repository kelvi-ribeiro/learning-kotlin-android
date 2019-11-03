package moreClasses

import java.lang.Exception

/*
 sealed: Serve para não permitir o uso da classe em arquivos externos da classe
 os usos são de herança
 */

sealed class Result {
    class Success(val message: String): Result()
    class Error(val message: String, val errorCode: Int): Result()
}

class Repo{
    fun execute(): Result {
        return Result.Error("Deu Error", 404)
    }
}


fun main() {
    val r1 = Repo()
    val result = r1.execute()
    when (result) {
        is Result.Success -> {
            println("Deu sucesso")
        }

        is Result.Error -> {
            println("Deu Erro")
        }
    }
}
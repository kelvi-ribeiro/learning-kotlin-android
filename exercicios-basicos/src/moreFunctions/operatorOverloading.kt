package moreFunctions

/*
    Operator overloading: Com ele, é possível criar funções que somam um objeto
    a outro objeto e muito mais
 */

data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        if (denominator == add.denominator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator * add.denominator
            return Fraction(((common / denominator) * numerator) + ((common / add.denominator) * add.numerator), common)

        }
    }

    operator fun inc(): Fraction {
        return this
    }
}

fun main() {
    //val n1: Int = 10
    //n1.plus(10)
    var f1 = Fraction(3, 2)
    var f2 = Fraction(5, 3)
    println(f1 + f2)
    f1++

}
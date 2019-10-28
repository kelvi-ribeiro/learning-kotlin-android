package exercises.collections

val VOWELS = "aeiou"

fun countVowelsFilter(phrase: String) = phrase.filter { (it.toLowerCase() in VOWELS)}.count()



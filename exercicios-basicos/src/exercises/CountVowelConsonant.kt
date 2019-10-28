package exercises

val VOWELS = "aeiou"

fun countVowels(phrase: String): Int {
  var totalVowels = 0
  for (letter in phrase) {
    if (letter.toLowerCase() in VOWELS) totalVowels++
  }
  return totalVowels
}

fun countConsonants(phrase: String): Int {
  var totalConsonants = 0
  for (letter in  phrase) {
    if (letter.isLetter() && letter.toLowerCase() !in VOWELS) totalConsonants++
  }
  return totalConsonants
}

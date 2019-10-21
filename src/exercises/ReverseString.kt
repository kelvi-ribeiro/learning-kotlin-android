package exercises

import java.lang.StringBuilder

fun reverseUsingSB(str: String): String {
  return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
  var index = str.length - 1
  var partsString: String = ""
  while (index >= 0) {
    partsString += str[index]
    index--
  }
  return partsString
}


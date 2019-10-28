package exercises.collections

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {
  @Test
  fun countVowelsFilter() {
    Assert.assertEquals(8, countVowelsFilter("Minha frase com vogais!"))
  }
}

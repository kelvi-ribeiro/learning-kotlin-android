## Desenvolvimento de Aplicativos Android usando Kotlin!

Curso na Udemy de desenvolvimentos de aplicativos com Kotlin. Link do Curso:https://www.udemy.com/course/curso-desenvolvedor-kotlin/. Mas o principal objetivo foi de aprender os conceitos básicos de Kotlin e não de Android

## Variados

 ```kotlin
 // Range - é possível definir um intervalo de valores facilmente com o uso do when com o in ..
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
```

## Definições

```kotlin
println(str?.length) // Assume ao Kotlin que não pode dar erro. O erro não é disparado`
println(str!!.length) // Assume ao Kotlin que pode dar erro. O erro é disparado
```

### Básico

**init:** É a palavra reservada e serve para executado independente de quantidade construtores.
 
**init:** É a palavra reservada e serve para executado independente de quantidade construtores.

**Herança:** Para que uma classe seja herdada por outra, precisamos que a classe   pai tenha a palavra reservada de open, além disso, na classe filha, precisamos chamar o construtor da classe pai passando os parâmetros
**Overide:** Para sobreescrever métodos no Kotlin, é necessário a palavra reservada open
**Overload**: É quando se tem um método com assinatura diferente do pai
**Assinatura:** É a quantidade de parâmetros e seus respectivos tipos de um método

**Interface:** Define um contrato, a principal diferença entre uma classe abstrata e uma interface, é que a interface não pode possuir estado, ou seja não pode ter um atributo com atribuição de valor. Uma mudança recente fez que interfaces pudessem conter métodos com corpo e não a assinatura do mesmo.
**Conceito de Herança/Interface:** Uma classe pode herdar somente uma classe, mas pode ter várias interfaces.

 **lateinit:** É usado quando não se desejado criar uma variável com um valor, uma variável inicializada com lateinit sempre deve ser declarada com var, pois o que acontece por baixo dos panos é um atribuição automática.
 
 **with:** Se tivermos alguma variável que seja desejado fazer várias interações com ela, chamar seus métodos por ex, podemos fazer isso o with de uma forma muito mais simples, sem ter que repetir a varíavel a cada instrução.
 
 #### Data Class
 
O data class serve muito bem para agregar um conjunto de dados, num jeito mais prático, variáveis,  pois ao invés de ter funções com vários parâmetros, pode-se ter um único parâmetro, sendo a data class com todos os parâmetros declarados como atributos.
Além disso, com o data class, ganhamos um toString que é muito útil para transição desses dados. Outro benefício bem claro, é que por padrão, quando dois objetos de uma mesma classe comum são comparados, o que  vai ser comparado vai ser a posição da memória desses dois objetos, já com o data class, já ganhamos um comparador no qual é comporado os valores de um objeto e não o sua posição na memória.  Também ganhamos por default um método de copy() que é possível copiar um objeto A para um objeto B


 
 #### Métodos estáticos
 
 **Companion object:** Um objeto que não necessariamente tem um nome e serve para criar atributos, métodos que irão fica num escopo num estático. Em outras palavras, os recursos da classe que são declaradas dentro um companion object ficam no escopo da classe e não de uma instância da classe, pode-se criar hieraraquias, mas o nome é necessário para isso. Também é possível criar singletons com o mesmo
 **Object:** Tem os mesmo recursos de companion object, mas precisa ter um nome associado e com ele, podemos fazer uma hieraraquia de objets. Também é possível criar singletons com o mesmo.
 
 
 


### Funções

 **Funções anônima:** São funções que geralmente só tem um uso muito específico e não seja
desejado dar um nome, apenas passar a função para uma execução.Diferente do Lambda conseguimos executar mais de uma instrução com o uso de funções anônimas.

**High order function:**:   Uma expressão lambda é uma maneira concisa de declarar uma função ou subrotina. Num mundo orientado a objetos, é bastante similar a um objeto que tem um método só. Existem duas vantagens principais de se usar uma expressão lambda ao invés de uma função ou método definida separadamante:

1. Simplicidade. Para que dar um nome a algo que só vai ser usado uma vez mesmo?
2. Escopo léxico. Funções lambda podem automaticamente usar todas as variáveis do escopo atual.


**infix function:** Com a palavra reservada infix function, é possível executar funções com uma legibilidade muito maior que o normal. Esse recurso só pode ser usado com funções de um só parâmetro.
 
**Funções internas:** São funções dentro de funções que só ficam acessíveis dentro da função pai, e caso tenha uma função externa com o mesmo nome que a interna e seja desajado executar a função externa, usamos a palavra reservada deeper.${functionName}
  
**Operator overloading:** Com ele, é possível criar funções que somam um objeto a outro objeto e muito mais.
  
  ### Mais Sobre Classes
  
 **Field:** É a palavra reservarda dentro de um contexto de get e set e serve para fazer uma atribuição(set) ou retorno(get) da variável em questão, pois usar o this diretamenta causa um loop chamando o método até estourar alguma exceção.
  
**Nested Class:** Classe interna, e precisamos declarar a palavrada revervada inner para conseguir fazer isso.
  
**Sealed:** Serve para não permitir o uso da classe em arquivos externos da classe os usos são de herança.

### Collections(Listas)

**listOf:** Criamos lista imutáveis, ou seja, não é possível adicionar elementos ou  remover elementos na lista.
**mutableListOf:** Criamos uma lista mutável, sendo possível remover ou adicionar elements.
**arrayListOf:** Ganhamos um array exatamente igual ao ArrayList do Java, assim ganhando todos os métodos do mesmo
**setOf**: ganhamos um array imutável filho de Set do Java, no qual não permite elementos duplicados.
**mutableSetOf:** Ganhamos um array mutável filho de Set do Java, no qual não permite elementos duplicados.
**hashMapOf**: Se ganha um array do tipo genérico do HashMap, pode ser usado para fazer um estrutura de chave e valor.
**mapOf**: É uma lista do tipo igual ao hashMapOf, porém imutável.
**mutableMapOf:** É uma lista do tipo igual ao hashMapOf, mutável.

#### Métodos e utilitários com lista

1. O método count de uma lista  dá o número de elementos
2. O método sumByDouble, dado um conjunto de valores no predicado, nos retorna o a soma, os valores devem ser dobule
3. O método sumBy, dado um conjunto de valores no predicado, nos retorna e a soma, os valores devem ser Int.
4. O método take, com a quantidade de elementos como parâmetro nos retorna os primeiros $quantidadeElementos de um array
5. O método withIndex usado um for serve para além de ter o valor  daquele elemento de array numa interação, também seja possível pegar o index.
6. a palavra reservada it é o elemento default a ser interado dentro de um escopo de interação de uma lista como forEach, filter, map e etc...
 
 

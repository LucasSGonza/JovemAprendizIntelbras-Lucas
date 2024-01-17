<img src='https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white' width='150px'>

## 📚 Características da Linguagem

#### Program entry point:
- An entry point of a Kotlin application is the main function.
```kotlin
fun main() {
    println("Hello world!")
}
```

#### Comments:
- Just like most modern languages, Kotlin supports single-line (or end-of-line) and multi-line (block) comments.
```kotlin
// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */
```

#### String templates
- link: [String templates](https://kotlinlang.org/docs/strings.html#string-templates)
- A template expression starts with a dollar sign ($) and consists of either a name:
```kotlin
var a = 1
// simple name in template:
val s1 = "a is $a" 

a = 2
// arbitrary expression in template:
val s2 = "${s1.replace("is", "was")}, but now is $a"
//output => a was 1, but now is 2
```
#### String formatting
- link [String formatting](https://kotlinlang.org/docs/strings.html#string-formatting)
- To format a string to your specific requirements, use the [String.format()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html) function.
```kotlin
// Formats to add zeroes and make a length of seven
val integerNumber = String.format("%07d", 31416)
println(integerNumber)
// 0031416

// Formats with four decimals and sign
val floatNumber = String.format("%+.4f", 3.141592)
println(floatNumber)
// +3.1416

// Formats with uppercase for two placeholders
val helloString = String.format("%S %S", "hello", "world")
println(helloString)
// HELLO WORLD
```
### 🎲 Tipos de dados
```
🔹 Int (inteiro 32 bits)        🔹 Long (inteiro 64 bits)            🔹 Short (inteiro 16 bits)
🔹 Byte (inteiro 8 bits)        🔺 Double (flutuante 64 bits)        🔺 Float (flutuante 32 bits)    
🔸 String			            🔸 Char                              📦 Array    
❔ Boolean
```
## 💾 Variáveis, constantes e tipos de declaração geral
- `val`: constante (imutável) ➡ não precisa necessariamente receber valor ao ser instanciada, mas seu valor é imutável
- `var`: variável (mutável)
- Tipos de declarações:
  - `val num: Int;` ➡ `num = 1`
  - `var num = 1;`
  - `val num: Int = 2;`

## 💱 Conversão de dados (type casting)

Links: 
- [Type checks and casts﻿](https://kotlinlang.org/docs/typecasts.html)
- [Kotlin - Type casting](https://www.geeksforgeeks.org/kotlin-explicit-type-casting/)

🔸 In Kotlin, you can perform type checks to check the type of an object at runtime. Type casts convert objects to a different type

🔹 2 operadores => **IS , AS** (relativamente intuitivos)

### 🍺 IS
- funciona como um if, no caso como se fosse uma afirmação, que retornará um booleano. 
- Use the is operator or its negated form !is to perform a runtime check that identifies whether an object conforms to a given type:
- Ex:
```kotlin
if (obj is String) {
    print(obj.length)
}

if (obj !is String) { // Same as !(obj is String)
    print("Not a String")
} else {
    print(obj.length)
}
```

### 🧠 Smart casts
Link: [Smart casts](https://kotlinlang.org/docs/typecasts.html#smart-casts)

- In most cases, you don't need to use explicit cast operators in Kotlin because the compiler tracks the is-checks and explicit casts for immutable values and inserts (safe) casts automatically when necessary
- The compiler is smart enough to know that a cast is safe if a negative check leads to a return
- Smart casts work for when expressions and while loops as well

---
### 🍷 AS
- funciona como uma atribuição (como em SQL), no caso indicando um tipo para a variável/objeto caso este não esteja explícito. Pode ser utilizado com  `?`, para "safe" cast
- Usually, the cast operator throws an exception if the cast isn't possible. Thus, it's called unsafe. The unsafe cast in Kotlin is done by the infix operator as.
- Ex:
```kotlin
val x: String = y as String
```
- Note that null cannot be cast to String, as this type is not nullable. If y is `null`, the code above throws an exception. To make code like this correct for `null` values, use the nullable type on the right-hand side of the cast:
```kotlin
val x: String? = y as String?
```
- To avoid exceptions, use the **safe cast** operator `as?`, which returns `null` on failure.
```kotlin
val x: String? = y as? String
```

## 🎮 Operadores
- `<, >, //, ==, !=, !, ++, --, +=, -=, *=, /=, &&, ||`
- [Swift Basic Operators](https://docs.swift.org/swift-book/documentation/the-swift-programming-language/basicoperators/)
- [Keywords and operators](https://kotlinlang.org/docs/keyword-reference.html)

## ❓ Operadores Condicionais
- Link: [Conditions and loops](https://kotlinlang.org/docs/control-flow.html)
- *`If, if/else, else if, when, ?: (elvis operator)`*
- there is no ternary operator (condition ? then : else) because ordinary if works fine in this role.
- Exemplo:
```kotlin
var max = a
if (a < b) max = b

// With else
if (a > b) {
    max = a
} else {
    max = b
}

// As expression
max = if (a > b) a else b

// You can also use `else if` in expressions:
val maxLimit = 1
val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b
```
#### `when`
- `when` defines a conditional expression with multiple branches. It is similar to the `switch` statement in C-like languages. Its simple form looks like this:
```kotlin
when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
        print("x is neither 1 nor 2")
    }
}
```

#### Elvis Operator `?:`
- [Kotlin Elvis Operator](https://www.baeldung.com/kotlin/elvis-operator)
- [Elvis Operator - Kotlin Official website](https://kotlinlang.org/docs/null-safety.html#elvis-operator)
- Em resumo, é o ternário do Kotlin
- Exemplo:
```kotlin
//using if/else
val l: Int = if (b != null) b.length else -1

//using ?:
val l = b?.length ?: -1
```

## 🤠 Array
- [Arrays in Kotlin](https://kotlinlang.org/docs/arrays.html)
- An array is a data structure that holds a **fixed number of values** of the **same type** or its subtypes. The most common type of array in Kotlin is the object-type array, represented by the Array class.
- Criação:
    - functions, such as `arrayOf()`, `arrayOfNulls()` or `emptyArray()`.
    - the Array constructor
    
- Exemplo:
```kotlin
// Creates an array with values [1, 2, 3]
val simpleArray = arrayOf(1, 2, 3) // or val simpleArray: Array<Int> = arrayOf(1, 2, 3)
println(simpleArray.joinToString())
```

## 🙂 Collections
- [Collections overview﻿](https://kotlinlang.org/docs/collections-overview.html)
- A collection usually contains a number of objects of the same type (and its subtypes).
- 3 tipos principais: **List**, **Set** e **Map (ou dictionary)**

- Note that a **mutable collection doesn't have to be assigned to a `var`**. Write operations with a mutable collection are still possible even if it is assigned to a `val`
- The benefit of assigning mutable collections to `val` is that you **protect the reference** to the mutable collection from modification
```kotlin
val numbers = mutableListOf("one", "two", "three", "four")
numbers.add("five")   // this is OK
println(numbers)
//numbers = mutableListOf("six", "seven")      // compilation error
```
## 🧶 Laços de Repetição

#### 🔹 While e do-while
- Sintaxe padrão, similar a Java e JS
- while ➡ verifica a condição e então, se `true`, executa o bloco (primeiro verifica, depois, opcionalmente, executa o bloco)
- do/while ➡ executa o bloco e depois verifica a condição para então, opcionalmente, re-executar o código
- Sequências (ranges) controlam o for:
  - Exemplo:
    - `val range = 0...5` (inclusive, inclui tudo)
    - `val r = 0..<5` (exclusive, não inclui o limite)
---
#### 🔸 For
- The `for` loop iterates through anything that provides an iterator. This is equivalent to the `foreach` loop in languages like C#. The syntax of for is the following:
```kotlin
for (item in collection) print(item)

//the body of for can be a block
for (item: Int in ints) {
    // ...
}
```
---
```kotlin
for (i in 1..3) {
    println(i)
}
//output => 1 -> 2 -> 3

for (i in 6 downTo 0 step 2) {
    println(i)
}
//output => 6 -> 4 -> 2 -> 0
```

- **Links:**
  - [Ranges and progressions﻿](https://kotlinlang.org/docs/ranges.html)
  - [Loops](https://kotlinlang.org/docs/control-flow.html#for-loops)
  - [Hacking with Swift For Loops](https://www.hackingwithswift.com/sixty/4/1/for-loops)

## ⏸ 'Break', 'Continue' e 'Return'
- [Returns and jumps](https://kotlinlang.org/docs/returns.html)
- **Break:**
  - Utilizado para interromper iterações em loops ou switch/case
  - Comum dentro de if's para evitar validações desnecessárias
  - [More infos about Break in Kotlin](https://kotlinlang.org/docs/returns.html#break-and-continue-labels)
  - Exemplo usando `label`:
    - Any expression in Kotlin may be marked with a `label`. Labels have the form of an identifier followed by the `@` sign. To `label` an expression, just add a label in front of it.
    ```kotlin
      loop@ for (i in 1..100) {
          for (j in 1..100) {
              if (...) break@loop
          }
      }
    ```
    - A `break` qualified with a label jumps to the execution point right after the loop marked with that label. A `continue` proceeds to the next iteration of that loop.

- **Continue:**
  - Pula uma iteração e passa para a próxima instrução ou bloco de código
  
- **Return**
    - By default returns from the nearest enclosing function or anonymous function.
    - `return` também possuí interação com `label`, de forma que podemos definir um `return` para a estrutura identificada com certa `label
    - Exemplo:
    ```kotlin
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with explicit label")
    }
    // por padrão, o return iria retornar para fora da função foo()
    ```

## 👔 Functions ➡ `fun`
- [Functions in Kotlin](https://kotlinlang.org/docs/functions.html)
- Parâmetros precisam de nome + tipo
- Para definir um retorno para a função, usar `:`, como se estivesse definindo um "tipo" para a função.
- Assim como em `Swift`, os parâmetros podem ter um valor padrão
  - Exemplo:
    ```kotlin
    fun double(x: Int): Int {
        return 2 * x
    }
    calcMedia(nota1: 8, nota2: 10) //output (9.0)
    ```
    
## 📜 Lambdas
- Funciona como uma Arrow Function em JavaScript ou uma closure em Swift
- Pode ou não receber parâmetros
- Quando uma `lambda` recebe apenas um parâmetro, podemos omitir seu nome e utilizar a palavra reservada `it` para referenciar o valor
- Declaração nas `{ }`
- Sintaxe padrão: `{ (parametro) -> retorno }`
  - o `—>` serve para separar os parâmetros do tipo de retorno 
- Exemplo:
```kotlin
//func
fun somar (a: Int, b: Int): Int {
    return a + b
}

//closure
val somar: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
```
- **Links:**
  - [Lambdas in Kotlin](https://kotlinlang.org/docs/lambdas.html)
  
## ❓ Null safety and Exceptions
- Condição para permitir valores nulos (`null`) em variáveis
- Sintaxe: `var variavel: tipoVariavel?`
- Cuidado ao forçar unwrapping (`!!`) para não tomar um `NullPointerException`
- Exemplo:
```kotlin
var test: String = "abc"
test = null //compilation error

var b: String? = "abc" // can be set to null
b = null // ok
print(b) //output => null
```
- Safe call: Your second option for accessing a property on a nullable variable is using the safe call operator `?.`
```kotlin
val a = "Kotlin"
val b: String? = null
println(b?.length)
println(a?.length) // Unnecessary safe call
print(b!!.length) // >>> NPE: trying to get length of null
```

#### ❌ Exceptions
- [Exceptions](https://kotlinlang.org/docs/exceptions.html)
- To throw an exception object, use the `throw` expression:
```kotlin
throw Exception("Hi There!")

//Exception in thread "main" java.lang.Exception: Hi There!
    at FileKt.main (File.kt:2) 
    at FileKt.main (File.kt:-1) 
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (:-2) 
```
- To catch an exception, use the `try`...`catch` expression:
```kotlin
try {
    // some code
} catch (e: SomeException) {
    // handler
} finally {
    // optional finally block
}
```

## 👑 Class
- [Classes in Kotlin](https://kotlinlang.org/docs/classes.html)
- As classes em Kotlin são `final` por default, isso significa que elas não podem ser extendidas.
- Classes in Kotlin are declared using the keyword `class`.
- A `class` in Kotlin has a primary constructor and possibly one or more secondary constructors. The primary constructor is declared in the class header, and it goes after the class name and optional type parameters

```kotlin
class Person(name: String) {
 //...
}

//open -> possibila herança
open class Phone(var isScreenLightOn: Boolean = false) {
    
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
   bid?.let {
       // se nao for nulo
       return bid.amount
   } ?: run {
       // se for nulo
       return minimumPrice       
   }
}
```

- To create an instance of a class, call the constructor as if it were a regular function:
```kotlin
val person = Person("Joe Smith")
person.name //"Joe Smith"
```
---
## 🌳 Herança
- [Inheritance in Kotlin](https://kotlinlang.org/docs/inheritance.html)
- Permite compartilhar métodos e atributos entre classes
- Sintaxe: `class classeFilha() : classePai() { ... }`
- **Importante** ❗ : A subclasse pode ter suas próprias propriedades e métodos, e estes não podem ser acessados pela superclasse, já que o fluxo da herança é sempre da superclasse para a subclasse
- Para possibilitar herança, deve-se utilizar da palavra reservada `open` na classe pai e em suas funções a qual irão receber `override`

## 🧬 Polimorfismo
- Permite subclasse (classeFilha) sobrescrever métodos e propriedades da superclasse (classePai)
- Palavras reservada:  `override`

## 📲 Sobre Desenvolvimento de aplicativos Android
- [Criar e executar o app](https://developer.android.com/studio/run?hl=pt-br)
- [Desenvolverdor Júnior - Como criar projetos Android em Kotlin e/ou Java em poucos instantes?](https://www.youtube.com/watch?v=Msmqs2VY3kg)
- [Entenda o ciclo de vida da atividade](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br)
- [Diagrama Ciclo de vida da `Activity`](https://developer.android.com/guide/components/images/activity_lifecycle.png?hl=pt-br)
- [Executar apps em um dispositivo de hardware](https://developer.android.com/studio/run/device?utm_source=android-studio-2021-1-1&hl=pt-br)
- [Entendendo a estrutura de um projeto Android](https://www.youtube.com/watch?v=2vTAwoxa7MY)
- [Tiago Aguiar - Como criar um aplicativo para Android do zero](https://www.youtube.com/watch?v=z0gjnpvb8Zg)

[Para mais infos sobre desenvolvimento Android](https://github.com/LucasSGonza/JovemAprendizIntelbras-Lucas/tree/main/Kotlin/Tips.md)

---

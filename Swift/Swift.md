<img src='https://img.shields.io/badge/Swift-FA7343?style=flat&logo=swift&logoColor=white' width='150px' style='margin-left: 50%'>

## 📚 Características da Linguagem
- Tipagem: o tipo da variável é definido baseado no 1º valor que ela receber. Uma vez definido o tipo, este não poderá ser modificado
- `;` é opcional
- "Xcode": IDE oficial desenvolvida pela Apple para desenvolvimento de Swift
- Uso do `_`:
  - Usar `_` (underline) significa que o valor não é necessário ser citado. Exemplo:
    - `for _ in 0...2 { print('Ola Mundo') }` — irá simplesmente realizar o código do loop 3x
    - `func calcMedia (_ nota1: Double, _ nota2: Double ) { //código }` — nesse caso, por padrão, as funções em Swift utilizam de ‘label’ (tag identificador) para cada parâmetro, ou seja, utilizando o `_`, você retira a necessidade de, quando for chamar a função, ter que colocar as labels, no caso os nomes utilizados, no exemplo citado sendo nota1, nota2
- Programando com 'Opcionais':
  - `??` — utiliza-se quando a variável é do tipo opcional, dessa forma, após as `??`, coloca-se um valor padrão para a mesma.
    - This operator is generally used to provide a default value when an expression or variable produces an optional result.
  - Concatenação: `print("Média: ", media)` — usar `+` dá erro. O `+` iria concatenar apenas se tudo fosse String. 
  - **Dica**: utilizamos `"\(valor)"` para inserirmos o valor de uma variável ou constante dentro de uma string (Interpolação).

## ♟ Adentrando na Lógica

### 🎲 Tipos de dados
```
🔸 Int		    🔸 Double			    🔸 Float
🔸 String	    🔸 Character (char)		🔸 Bool (boolean)
🔹 Array	    🔹 Dictionary			🔹 Set
🔹 Enum         🔹 Tuple			    ❔ Optional
💥 Class	    💥 Struct			    💥 Protocol
💫 Any
```
## 💾 Variáveis, constantes e tipos de declaração geral
- `let`: constante (imutável)
- `var`: variável (mutável)
- Tipos de declarações:
  - `let num;` ➡ `num = 1`
  - `let num = 1;`
  - `let num: Int = 1;`

## 💱 Conversão de dados (type casting)

🔸 Sintaxe 1: 

`tipoDado(variável);`

Ex: 

`let x = 10`

`let name = String(x)`

`print(name)` — *output("10")*

🔸 Existe ainda alguns operadores muito utilizados quando o assunto é tipagem:

🔹 2 operadores => **IS , AS** (relativamente intuitivos)

🍺 IS ➡ funciona como um if, no caso como se fosse uma afirmação, que retornará um booleano. 
Ex:
```
nota is Double //true
nome is Int //false
```
---
🍷 AS ➡ funciona como uma atribuição (como em SQL), no caso indicando um tipo para a variável/objeto caso este não esteja explícito. É utilizado juntamente dos operadores  `!` e `?`, 
assim como nas opcionais. 
Ex:
```
//forçar o desempacotamento (usado quando se tem certeza do tipo da variável)

nome as! String<br>

//tentará mudar o tipo para String, mas retornará nil caso não consiga

email as? String
```

## 🎮 Operadores Lógicos
- No geral, iguais às outras linguagens (`<, >, //, ==, !=, !, +=, -=, …, &&, ||`)
- Link: [Swift Basic Operators](https://docs.swift.org/swift-book/documentation/the-swift-programming-language/basicoperators/)

## ❓ Operadores Condicionais
- *`If, if/else, else if, switch`* — iguais às outras linguagens
- Operador ternário: sintaxe — `expressão ? valor-seTrue : valor-seFalse;`

## 🗣 Comentários
- Igual Java: `//` ou `/* */`

## 😀 Tuplas
- Sintaxe padrão => `let numbers = (1,2,3)`
- Funciona semelhante como uma matriz em Java (uma ‘variável’ ou um espaço de memória que agrupa vários valores, podendo ser de tipos distintos ou não)
- Sintaxe de criação com a mesma lógica das variáveis (pode definir o tipo explicitamente ou não)
- Caso for definir o tipo, precisa ser para cada item da tupla (oq talvez não seja tão produtivo), visto que cada item é “único” (a tupla serve simplesmente para armazenar)
- **Pode ser inicializado vazia**
- É do tipo **Value Type**
- Por padrão, cada item da tupla pode ser acessado pelo seu índice, mas é possível atribuir ‘nomes’ para cada item (somente se o tipo não estiver declarado)=> `let coords = (lat: 22.1, lng: 27.6)`

## 🤠 Array
- Sintaxe padrão: `let numbers = [1,2,3]`
- **Pode ser inicializado vazia**
- É do tipo **Value Type**
- Alguns métodos usuais:
  - `append()`: adiciona na Array
  - `removeAll()`: auto-explicativo
  - `isEmpty`: auto-explicativo
  - `count`: verifica o tamanho da lista
  - `contains()`: verifica na Array se existe o elemento indicado no parâmetro
  - `first`: acessa o primeiro elemento da Array
  - `insert('item', at: 'índice')`: insere um elemento no índice indicado
  - `remove(at: 'índice')`: remove o item da Array no índice indicado
  - `removeLast()`: auto-explicativo, mas remove o último item da Array
  - `swapAt(0,1)`: troca os elementos de posição

## 📒 Dictionary
- [Link: Codecademy Dictionary Cheatsheet](https://www.codecademy.com/learn/learn-swift/modules/learn-swift-dictionaries/cheatsheet)
- Funciona muito semelhante a uma Array, mas utiliza do conceito de **chave-valor (key-value)**, semelhante a um JSON É necessário definir na criação o tipo da chave e do valor
- Possuí métodos da mesma forma que Array, possuindo alguns métodos até idênticos, mas no geral os métodos realmente “são os mesmos” que na array, mas atualizados para a sintaxe do dictionary.
- **Os retornos dos valores sempre são como Opcionais**
- É do tipo **Value Type**
- Usos gerais:
```
◽ Sintaxe de criação:

var products: [tipoChave : tipoValor] = [ : ] —> iniciando vazia

◽ CRUD valores (sempre atento ao tipo da chave e do valor):

🟣CREATE ja na criação do dicionario  —>
var products: [Int : String] = [1 : “Fone de ouvido”]

🟣CREATE/UPDATE normal —>
products[1] = “Fone de ouvido”

🟣MÉTODO CREATE/UPDATE —> 
dictionary.updateValue(valor, forKey: chave) // add or update a key-value

🔵DELETE meio estranho —> 
products[0] = nil // nil significa a ausência de valor

🔵 MÉTODO DELETE mais legal —> 
removeValue(forKey: 0) // a partir da chave informada, remove o item

🟡 READ de chave —>
for key in products.key { print(key) }

🟡 READ de valor —>
for val in products.values { print(val) }

🟡 READ key-value —>
for (key, value) in products { print (“chave: \(key), valor: \(valor))” }
```
## 🙂 Sets
- [Link: Codecademy Set Cheatsheet](https://www.codecademy.com/learn/learn-swift/modules/learn-swift-sets/cheatsheet)
- Semelhante a um Array, mas não permite itens repetidos
- Igualmente a Array, permite apenas 1 tipo (coleção de dados únicos de mesmo tipo)
- Utilidade: quando você precisa de uma lista de itens únicos
- Sintaxe padrao ➡ `var newSet: Set<tipo> = [ ]`
- Exemplo
```swift
//simulando a Mega-sena

var numbers = 6
var result: Set<Int> = [ ]

while (numbers > 0) {
	//método que gera numeros aleatorios a partir do range definido
	let generated = Int.random (in: 1…60)

	//só irá inserir no Set se o número gerado não for repetido
	let res = result.insert(generated)

	if (res.inserted) {
		numbers--
	}
}
```
## 🧶 Laços de Repetição

#### 🔹 While
- Sintaxe padrão, similar a Java e JS (verifica a condição e executa o bloco de código)
- Repeat/while: semelhante ao do/while (executa o bloco de código e verifica a condição)
- Sequências (ranges) controlam o for:
  - Exemplo:
    - `let range = 0...5` (inclusive, inclui tudo)
    - `let r = 0..<5` (exclusive, não inclui o limite)
---
#### 🔸 For-in
- **Sintaxe 1:**
  - `for i in x...y { }`
  - `i` é uma variável padrão, imutável (`let`)
  - Utiliza a cláusula `where` para condições no loop
  - Exemplo:
    ```swift
    for i in 1...10 where i % 2 == 0 { print(i) }
    ```
  - Loop for é fácil de interpretar
    ```swift
    let sequence = 1...5
    for num in sequence {
      print(num) // exibe todos os itens de 'sequence'
    }
  - **Sintaxe 2 (mais padrão):**
    ```swift
    for item in items { // Faz algo }
    ```
  - Útil para iterar uma Array, similar a `forEach()`

- **Links:**
  - [Programiz For-in Loop](https://www.programiz.com/swift-programming/for-in-loop)
  - [Appy Pie Loops in Swift](https://www.appypie.com/loops-swift-how-to)
  - [Hacking with Swift For Loops](https://www.hackingwithswift.com/sixty/4/1/for-loops)

## ⏸ 'Break' e 'Continue'
- **Break:**
  - Utilizado para interromper iterações em loops ou switch/case
  - Comum dentro de if's para evitar validações desnecessárias

- **Continue:**
  - Pula uma iteração e passa para a próxima instrução ou bloco de código

## 👔 Functions ➡ `func`
- Semelhante às sintaxes de métodos em Java e functions em JavaScript
- Parâmetros precisam de nome + tipo
- Uso de `return` requer a definição do tipo de retorno
- Nomes de variáveis de parâmetro funcionam como labels
  - Exemplo:
    ```swift
    func calcMedia (nota1: Double, nota2: Double) -> Double {
        return ( (nota1 + nota2) / 2)
     }
    calcMedia(nota1: 8, nota2: 10) //output (9.0)
    ```
## 📜 Closure
- Funciona como uma Arrow Function em JavaScript
- Pode ou não receber parâmetros
- Declaração nas `{ }`
- Sintaxe padrão: `{ (parametro) -> tipoRetorno in // código }`
  - o `in` funciona como uma `—>` em JS
  - o `—>` serve para separar os parâmetros do tipo de retorno 
- Exemplo:
```swift
//func
func somar (a: Int, b: Int) -> Int {
    return a + b
}

//closure
{ (a: Int, b: Int) -> Int in
    a + b								
}
```
- Exemplo prático, usando no método *filter* das *Array's*
```swift
customHeroesArray.filter {
    $0.name.lowercased().contains(searchText.lowercased())
}
```

- **Links:**
  - [Programiz Closures](https://www.programiz.com/swift-programming/closures)
  
## ❓ Opcionais
- Condição para permitir valores nulos (`nil`) em variáveis
- Sintaxe: `var variavel: tipoVariavel?`
- Cuidado ao forçar unwrapping (`!`)
- Boas práticas: usar `if let` ou `guard let` para evitar fatal errors ou definir um valor padrão.
- Exemplo:
```swift
var total: Int?
1. let numberTotal = total //exibirá um aviso/erro sobre o fato de 'total' ser opcional
2. let numberTotal = total ?? 60 //caso total = nil, numberTotal = 60
3. let numberTotal = total! //forçará o unwrapping. Caso total = nil, dará fatal error
```
#### 🌝 if let
- faz uma verificação if para ver se a variável possuí valor.
```swift
if let numberTotal = total { 
    return numberTotal 
} //else é opcional
```

---

#### 🌚 guard let
- muito semelhante ao 'if let' mas realiza as operações em ordem trocada: **primeiro verifica o erro**, para ent seguir com o sucesso (`true`)
```swift
guard let numberTotal = total else { return }
//caso true, ...
```

- Quando usar ➡ semelhante ao **NOT NULL** em **SQL**, ou seja, geralmente utilizado após verificar se é necessário ou não existir um valor. 
- In fact, esse é um dos motivos para existir esse tipo, visto que serve para tratar, por exemplo, valores nulos vindo de um BD, visto que no BD podem existir campos que permitem serem nulos, fazendo com que em nosso sistema realizassemos a mesma lógica, definindo algumas variáveis como *opcionais*
- É possível definir mais condições ao utilizar o if let e guard let, utilizando ' , ':
```swift
if let user = loadUsername(), let password = decryptPassword() {
    authenticate(user, password)
}
```

## 📖 Enum
- **Lista de itens**, cada item é um 'case'
- Podem ser atribuídos códigos para cada 'case' utilizando um switch (fora da estrutura do enum)
- Tipo do enum não precisa ser especificado
- Pode armazenar valores de qualquer tipo e os tipos destes valores podem ser diferentes para cada membro do enum (logo, deve-se avaliar se vale a pena limitar o tipo do enum ou de seus case's)
- `rawValue` ou estrutura `switch self` para obter o valor do case
- É do tipo **Reference Type**, assim como as *'Class'*

## 🏡 Struct
- Semelhante a classes, mas mais simples
- **Não permite herança**
- É do tipo **Value Type** ➡ objetos de um *struct* igualam *valor* e não referência (à um espaço de memória)
- Pode criar cópias de um único objeto (por ser *value type*)
- Exemplo:
```swift
struct Player {
    var name: String = "Lucas"
}

//cria uma instância de Player
let player1 = Player()
player1.name // "Lucas"

//cria uma segunda instância e iguala à primeira
let player2 = player1
player2.name // "Lucas"

//faz alguma alteração em seu atributo
player2.name = "Pedro"

//Por ser VALUE TYPE, player1 e player2 são objetos diferentes
player1.name // "Lucas"
player2.name // "Pedro"
```

## 👑 Class
- É do tipo **Reference Type** ➡ objetos de uma *class* igualam sua referência de memória
- Permite Herança simples ➡ existe a estrutura chamada *protocol* para 'simular' uma herança múltipla, na qual a class que 'herdar' o protocol deverá pegar seus métodos, por ex.
- Exemplo:
```swift
class Player: Any {
    var name: String = "Lucas"
}

//cria uma instância de Player
let player1 = Player()
player1.name // "Lucas"

//cria uma segunda instância e iguala à primeira
let player2 = player1
player2.name // "Lucas"

//faz alguma alteração em seu atributo
player2.name = "Pedro"

//Por ser REFERENCE TYPE, player1 e player2 estarão referenciando o mesmo espaço de memória, portanto qualquer alteração feita por algum desses objetos, fara alteração na referência a qual eles possuem.
player1.name // "Pedro"
player2.name // "Pedro"
```

### 😲 Mais infos sobre Class e Struct
- [[SWIFT] STRUCT OU CLASS, PRA QUE SERVE?
](https://www.youtube.com/watch?v=tKSNjg9Cb_g&list=PLZPWdr0WUuJ93mjCDaxLM8ZOi_5BwG7iC&index=6)
- Caso nao definir um valor inicial para um atributo, deve ser criado um metodo inicializador ou definir o atributo como *opcional* (`?`)
- Exemplo:
```swift
class Pessoa {
    var nome: String
    var idade: Int
    var profissao: String

    init(nome: String, idade: Int, profissao: String) {
        self.nome = nome
        self.id = id
        self.profissao = profissao
    }
}
```

## 🔐 Encapsulamento
- Serve pra definir os tipos de acesso às classes, propriedades e métodos
- Tipos:
  - ***public*** – Permite acesso a qualquer outro elemento.
  - ***internal*** – Permite acesso apenas dentro da própria classe e nas classes herdeiras.
  - ***private*** – Permite acesso apenas dentro da classe na qual foi declarada.

- **OBS**:
  - por padrão, o nível de encapsulamento é '*internal*'.
  - o encapsulamento do Swift funciona apenas se a classe e sua instância estiverem em arquivos separados.

## 🌳 Herança
- Permite compartilhar métodos e atributos entre classes
- Sintaxe: `classeFilha : classePai`
- **Importante** ❗ : A subclasse pode ter suas próprias propriedades e métodos, e estes não podem ser acessados pela superclasse, já que o fluxo da herança é sempre da superclasse para a subclasse

## 🧬 Polimorfismo
- Permite subclasse (classeFilha) sobrescrever métodos e propriedades da superclasse (classePai)
- Palavras reservadas: `override`, `final`

## 🔖 Protocol
- Funciona como uma classe abstrata em Java
- Modelo para outras classes, definindo métodos e atributos
- Sintaxe e exemplo:
```swift
  protocol Greet {
    var name: String { get }
    func message()
  }
  
  class Employee: Greet {
    var name = "Perry"
    func message() {
      print("Good Morning!")
    }
  }
```
- Link: [Swift Protocols
](https://www.programiz.com/swift-programming/protocols#:~:text=In%20Swift%2C%20a%20protocol%20defines,(or%20any%20other%20types))

## ⚙ Delegate

- Links:
  - [Implementing delegates in Swift, step by step.
](https://jamesrochabrun.medium.com/implementing-delegates-in-swift-step-by-step-d3211cbac3ef)
  - [Protocol Delegate em Swift
](https://medium.com/mackmobile/protocol-delegate-em-swift-5f521e19ca56)
- Delegates are a design pattern that allows one object to send messages to another object when a specific event happens.
- Imagine an object A calls an object B to perform an action. Once the action is complete, object A should know that B has completed the task and take necessary action, this can be achieved with the help of delegates!

## 🧐 'willSet' and 'didSet'

- **Link:** [https://www.codingem.com/didset-and-willset-in-swift/](https://www.codingem.com/didset-and-willset-in-swift/)
- Os observadores `didSet` e `willSet` provêm uma maneira de responder corretamente quando uma propriedade tem seu valor definido/alterado.
- O observador `willSet` é chamado antes de o valor ser atribuído a uma propriedade.
- O observador `didSet` é chamado depois de uma propriedade ter recebido um valor.
```swift
var name: String = "Alice" {
    willSet {
        print("Name will change from \(name) to \(newValue)")
    }
    didSet {
        print("Name changed from \(oldValue) to \(name)")
    }
}
name = "Jack"
// Output:
// Name will change from Alice to Jack
// Name changed from Alice to Jack
```
- Property observers also take parameters that refer to the old and the new values. By default, these parameters are called `oldValue` and `newValue`.
- The `willSet` block always stores the incoming value as `newValue`.
- The `didSet` block always stores the previous value as `oldValue`.
- To access these parameters, you do not need to declare them anywhere. They are automatically in your use.
---
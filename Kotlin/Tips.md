<img src='https://img.shields.io/badge/Android-34A853?style=flat&logo=android&logoColor=white' width='150px'>

# Dicas sobre Projetos no Android Studio

- Trabalhar com os arquivos `.xml` é muito semelhante à trabalhar com os arquivos `.storyboard` do XCode 
- usar `Log.e(tag: “”, message: “”)` ao inves de `print()

## ⌨️ Shortcuts
- [Keyboard shortcuts](https://developer.android.com/studio/intro/keyboard-shortcuts?hl=pt-br)
- F1 => mostra documentação. F1 2x fixa na IDE a doc (igual Xcode). Dá para configurar isso no proprio Android Studio, para aparecer a documentação após x ms.
- command + alt + L => **identa o código**

## 📂 Arquivos importantes 
- [Android Manifest](https://developer.android.com/guide/topics/manifest/manifest-intro?hl=pt-br) => declara todos os componentes do projeto, permissões, etc
- `res/drawable` => armazenar os icones
- `res/layout` => armazena os arquivos .xml (das activities)
- `res/values` => igual os arquivos `.cxassets` nos projetos Swift, armazena arquivos que padronizam cores, strings, etc, do seu projeto
    - `strings.xml` => geralmente existe um para cada idioma do app. Caso não existir essa diferenciação, por padrão, buscará o “strings.xml” default
- Gradle Scripts => gerencia as builds e dependências do projeto

## 📝 Alguns padrões
- nome de arquivos `.kt` => *camel case* (primeiras letras das palavras maiusculas, sem espaços)
- nome de arquivos `.xml` => *snake case* (primeiras letras usualmente em minusculo, separadas, caso necessário, por `_` (underline)
- nome do arquivo `.kt` é o contrário do .xml relacionado
    - ex: `MainActivity.kt` , `activity_main.xml`

## 💎 Dicas Gerais

- `AppCompatActivity` => tipo básico de uma `Activity` (tipo `UIViewController`, em Swift)
- **Métodos ciclo de vida**: `onCreate() , onStart() , onResume() , onPause() , onStop() , onRestart() , onDestroy()`
- `setContentView()` => define a activity relacionada ao arquivo .kt que irá codar coisas para a tela (igual a relação entre os arquivos `.swift` e `.storyboard`, em Swift)
- `lateinit` allows initializing a not-null property outside of a constructor 
- `inflate()` => Inflater in android means to read the XML file which describes a layout and to create the some objects of it
- [`AlertDialog`](https://www.digitalocean.com/community/tutorials/android-alert-dialog-using-kotlin)
---
- `R` => *class generated automatically by the tools that build your project*
    - [What is 'R' in Kotlin - stackOverflow](https://stackoverflow.com/questions/63333247/whats-r-in-kotlin-android-studio)
    - [Acessar os recursos do App - Dev Android official website](https://developer.android.com/guide/topics/resources/providing-resources?hl=pt-br#Accessing)
    - *“Android R. java is an auto-generated file by aapt (Android Asset Packaging Tool) that contains resource IDs for all the resources of res/ directory. If you create any component in the activity_main. xml file, id for the corresponding component is automatically created in this file.”*
    - sintaxe: *R  . (tipo de recurso, como `string`, `drawable` e `layout`)  . (nome do recurso / nome do arquivo)*
---
- ***Scalable pixels* (`sp`) serve the same function as density-independent pixels (`dp`), but for fonts. The default value of an sp is the same as the default value for a dp. The primary difference between an sp and a dp is that sp's preserve a user's font settings.*
- [Working With Maps in Kotlin](https://www.baeldung.com/kotlin/maps)
- ***Singleton** is a creational design pattern that lets you ensure that a class has only one instance while providing a global access point to this instance*
    - [Singleton Classes](https://www.baeldung.com/kotlin/singleton-classes)
    - [Singleton utilizando `objects` em Kotlin](https://medium.com/@jeffersontpadua/padrão-singleton-simplificado-utilizando-objects-em-kotlin-e1bc0faeb64e)
---

## 📋 Layouts with XML
- 4 dimensões: start (left), end (right), top e bottom           
- 1º definir as referências da constraints (`layout_constraint` -> ex: `StartToStartOff = 'parent'` ou `TopToBottomOf='id/main_layout'`), dps caso necessário, os valores com margin (top, start, …)
- [Difference Between `MATCH_PARENT`, `FILL_PARENT` and `WRAP_CONTENT`](https://www.geeksforgeeks.org/android-difference-between-match_parent-fill_parent-and-wrap_content/)

## 🔑 `Binding`
- trata-se de uma alternativa para buscar `Views` do Android
- por padrão, temos acesso ao `findViewById()`
- Modo de importar e usar no projeto !
```kotlin
    //build.gradle (Module :app)
        buildFeatures {
            compose true
            viewBinding true
        }
```
```kotlin
    //Na activity (view)
    private lateinit var binding: (a activity que desejar) 
    
```
- Por padrao, todas as activities ja criam um ‘binding’ de seus itens, bastando apenas nós captarmos esse ‘tipo’ que guarda essas informações
```kotlin
    binding = ActivityMainBinding.inflate(layoutInflater)
```

## 📜 `View` e `ViewGroup`
- `View` => elemento de tela
- `ViewGroup` => fundamentalmente tbm são ‘view’s’, mas são uma camada acima, funcionando exatamente como se chamam “grupo de views”.
- [Layouts - View e ViewGroup](https://developer.android.com/guide/topics/ui/declaring-layout?hl=pt-br)

*Os objetos View geralmente são chamados de "widgets" e podem ser uma das muitas subclasses, como Button ou TextView. Os objetos ViewGroup geralmente são chamados de layouts e podem ser de um dos muitos tipos que fornecem uma estrutura de layout diferente, como LinearLayout ou ConstraintLayout .*

## ♻️ `RecyclerView`
- [Criar listas dinâmicas com o RecyclerView](https://developer.android.com/develop/ui/views/layout/recyclerview?hl=pt-br)
- [Listando elementos utilizando RecyclerView no Android Studio](https://www.youtube.com/watch?v=za4kz4j3Z7w)
- [RecyclerView in Android Studio using Kotlin | 2024](https://www.youtube.com/watch?v=IYhmpUmeGOQ)
- [RecyclerView in Kotlin: A Modern Way to Display Lists in Android](https://rezaramesh.medium.com/recyclerview-in-kotlin-a-modern-way-to-display-lists-in-android-9c5cb3678b96)
- [RecyclerView Swipe to delete with Background Icon. Android Studio | Kotlin.](https://www.youtube.com/watch?v=V0I0Zc2b4gk)
    - [RecyclerViewSwipeDecorator](https://github.com/xabaras/RecyclerViewSwipeDecorator?tab=readme-ov-file)

---

1. Adapter —> _tratamento da lógica/dados_ 
    - O Adapter é responsável por fornecer os dados e criar as visualizações para cada item na lista. Ele estende a classe RecyclerView.Adapter e implementa métodos específicos, como onCreateViewHolder, onBindViewHolder e getItemCount.

2. LayoutManager —> _tratamento do visual_
    - O LayoutManager é responsável por posicionar e organizar os itens na RecyclerView. O Android fornece vários LayoutManagers predefinidos, como LinearLayoutManager (para exibir uma lista vertical ou horizontal) e GridLayoutManager (para exibir uma grade), além da possibilidade de criar LayoutManagers personalizados.

3. ViewHolder —> _tratamento do visual INDIVIDUAL de cada item da lista_
    - O ViewHolder representa uma visualização individual dentro da RecyclerView. Ele é responsável por manter referências aos elementos de interface do usuário dentro de cada item e pode ser personalizado para melhorar o desempenho, implementando técnicas como o padrão de View Holder.
  
_O ciclo de vida típico da `RecyclerView` envolve a criação do `Adapter`, definição do `LayoutManager`, vinculação da `RecyclerView` ao `Adapter` e preenchimento da `RecyclerView com dados._

### Comparando com Swift…

- RecyclerView == TableView ou CollectionView
- Adapter == DataSource ==> tableView.dequeueReusableCell …
- LayoutManager == Delegate (?)
- ViewHolder == dataSource + cells (xib + cells) ==> ex: cellForItemAt

## 🗂 Arquitetura **MVVM**
- [Arquitetura MVVM - Coodesh](https://coodesh.com/blog/dicionario/o-que-e-arquitetura-mvvm/)
- [About ViewModel in Android](https://www.youtube.com/watch?v=v32hSKtlH9A)
- [Arquiteturas em Android : MVVM + Kotlin + Retrofit](https://othiagosouto.medium.com/arquiteturas-em-android-mvvm-kotlin-retrofit-parte-1-2ac77c8a26)
- Model, View, ViewModel
    - Model = camada lógica, trabalha com data (classes, por ex)
    - View = interface do usuário (trabalha unicamente com UI)
    - ViewModel = interação entre View e Model. Funciona como o “Controller” na arquitetura MVC
---

<img src='https://img.shields.io/badge/Android-34A853?style=flat&logo=android&logoColor=white' width='150px'>

## Dicas sobre Projetos no Android Studio

- Trabalhar com os arquivos `.xml` é muito semelhante à trabalhar com os arquivos `.storyboard` do XCode 
- usar `Log.e(tag: “”, message: “”)` ao inves de `print()

#### ⌨️ Shortcuts
- [Keyboard shortcuts](https://developer.android.com/studio/intro/keyboard-shortcuts?hl=pt-br)
- `F1` => mostra documentação. F1 2x fixa na IDE a doc (igual Xcode). Dá para configurar isso no proprio Android Studio, para aparecer a documentação após x ms.

###  📂 Arquivos importantes 
- [Android Manifest](https://developer.android.com/guide/topics/manifest/manifest-intro?hl=pt-br) => declara todos os componentes do projeto, permissões, etc
- `res/drawable` => armazenar os icones
- `res/layout` => armazena os arquivos .xml (das activities)
- `res/values` => igual os arquivos `.cxassets` nos projetos Swift, armazena arquivos que padronizam cores, strings, etc, do seu projeto
    - `strings.xml` => geralmente existe um para cada idioma do app. Caso não existir essa diferenciação, por padrão, buscará o “strings.xml” default
- Gradle Scripts => gerencia as builds e dependências do projeto

---

### 📝 Alguns padrões
- nome de arquivos `.kt` => *camel case* (primeiras letras das palavras maiusculas, sem espaços)
- nome de arquivos `.xml` => *snake case* (primeiras letras usualmente em minusculo, separadas, caso necessário, por `_` (underline)
- nome do arquivo `.kt` é o contrário do .xml relacionado
    - ex: `MainActivity.kt` , `activity_main.xml`
    
---

- `AppCompatActivity` => tipo básico de uma `Activity` (tipo `UIViewController`, em Swift)
- métodos ciclo de vida: `onCreate() , onStart() , onResume() , onPause() , onStop() , onRestart() , onDestroy()`
- `R` => *class generated automatically by the tools that build your project*
    - [What is 'R' in Kotlin - stackOverflow](https://stackoverflow.com/questions/63333247/whats-r-in-kotlin-android-studio)
    - [Acessar os recursos do App - Dev Android official website](https://developer.android.com/guide/topics/resources/providing-resources?hl=pt-br#Accessing)
    - *“Android R. java is an auto-generated file by aapt (Android Asset Packaging Tool) that contains resource IDs for all the resources of res/ directory. If you create any component in the activity_main. xml file, id for the corresponding component is automatically created in this file.”*
    - sintaxe: *R  . (tipo de recurso, como `string`, `drawable` e `layout`)  . (nome do recurso / nome do arquivo)*
- `setContentView()` => define a activity relacionada ao arquivo .kt que irá codar coisas para a tela (igual a relação entre os arquivos `.swift` e `.storyboard`, em Swift)


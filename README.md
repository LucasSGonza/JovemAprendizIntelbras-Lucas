# Jovem Aprendiz Intelbras

Repositório voltado para ***organizar, registrar e manter*** todos os conhecimentos adquiridos e desenvolvidos durante minha trajetória como **Jovem Aprendiz na Intelbras**

---

## <img src='https://git-scm.com/images/logos/downloads/Git-Icon-1788C.svg' width='30px' align='center' style='padding-bottom:5px'/> Dicas sobre Git

### 📥 Importando um repositório

*1. git clone*
> cria um clone do projeto (repositório) em nossa máquina local.

*2. git add '{arquivos}'*
> realiza a inclusão ou modificação dos arquivos no diretório local, preparando ele para ser entregue ao servidor remoto

*3. git commit -m '{mensagem}'*
> confirma e salva as alterações para preparar para o envio

*4. git push {origin - endereço do repositório} {branch}*
> envia ao repositório remoto Git (sobe as alterações ao repositório no GitHub)

---

### ❗ Alguns comandos adicionais, mas importantes

➡ *git add '.'*
> seleciona todos os arquivos locais 

➡ *git remote add origin '{link repositório}'* 
> é usado para adicionar um repositório remoto como uma referência em seu repositório local. Ele define a conexão entre o seu repositório local e o repositório remoto, permitindo que você envie e receba alterações entre os dois

➡ *git branch*
> realizar operações com branches (criar, listar, renomear ou excluir) 
> link: https://blog.betrybe.com/git/git-branch/#1

➡ *git checkout*
> alterar a branch ou restaurar arquivos (da pra usar o 'git checkout -b {nome branch}' para criar e já entrar nessa nova branch (ramificação) criada).
> link: https://blog.betrybe.com/git/git-checkout/#1
 
➡ *git status*
> dá todas as informações necessárias sobre a branch atual

➡ *git reset*
> desfaz alterações (commits)

➡ *git rm '{opções: --force ou -f, por ex}' '{arquivos a serem removidos}'*
> remove arquivos

➡ *git mv '{arquivo_atual}' '{novo nome ou caminho}'*
> move ou renomeia arquivos

➡ *git pull '{origin}' '{branch}'*
> Busca e baixa o último conteudo salvo e atualizado do repositorio remoto 
> 
> É usado para trazer as atualizações mais recentes de um repositório remoto para o seu repositório local. 
> 
> O git pull é usado quando você já tem um repositório local e deseja sincronizá-lo com o repositório remoto, obtendo as últimas alterações.

### 📘 Exemplo:
```
➡ create a new repository on the command line:

🔸 git init
🔸 git add README.md
🔸 git commit -m "first commit"
🔸 git branch -M main
🔸 git remote add origin https://github.com/LucasSGonza/testezin.git
🔸 git push -u origin main

---

➡ push an existing repository from the command line:

🔸 git remote add origin https://github.com/LucasSGonza/testezin.git
🔸 git branch -M main
🔸 git push -u origin main
```
---
### 📱 Desenvolvimento Mobile iOS

>[Mais infos sobre desenvolvimento iOS](https://github.com/LucasSGonza/JovemAprendizIntelbras-Lucas/blob/main/AppsComSwift/MyApps/myApps.md)

---

### 🌎 Links Gerais

➡ [https://gitfichas.com/](https://gitfichas.com/)<br>
➡ [https://comandosgit.github.io/](https://comandosgit.github.io/)<br>
➡ [https://www.freecodecamp.org/portuguese/news/10-comandos-do-git-que-todo-desenvolvedor-deveria-conhecer/](https://www.freecodecamp.org/portuguese/news/10-comandos-do-git-que-todo-desenvolvedor-deveria-conhecer/)<br>
➡ [https://medium.com/@rafaelpiresvb/programação-reativa-com-reactivex-no-swift-e-kotlin-71e8a78fe07f](https://medium.com/@rafaelpiresvb/programação-reativa-com-reactivex-no-swift-e-kotlin-71e8a78fe07f)

---

### 📖 Links de estudo

➡ [Alura - Construção de Layouts no iOS com Swift: Storyboard, XIB e View Code](https://www.alura.com.br/artigos/ios-swift-diferencas-construcao-layouts-storyboard-xib-view-code?gclid=CjwKCAjwp6CkBhB_EiwAlQVyxTN_Ww64Fd-mqoph6pqmOBo-G1BNj3CfPyQqXxegOwGjbAr8yUsJPBoCj5kQAvD_BwE)

➡ [Medium - iOS View Controller Life Cycle](https://medium.com/good-morning-swift/ios-view-controller-life-cycle-2a0f02e74ff5)

➡ [Medium - Como passar entre páginas no Xcode](https://caiocnoronha.medium.com/como-passar-entre-p%C3%A1ginas-no-xcode-f7613820d912)

➡ [YouTube - Swift Tutorial: How to Pass Data Between View Controllers](https://www.youtube.com/watch?v=XzyF36Wun3U)

➡ [YouTube - Swift Tutorial: Introduction to Table Views](https://www.youtube.com/watch?v=DxCydBmOqXU)

➡ [YouTube - Swift Tutorial: How to Use Segues and Pass Data Between View Controllers](https://www.youtube.com/watch?v=09TeUXjzpKs)

---
### Para mais informações sobre **Swift** e **Kotlin**
- [Swift](https://github.com/LucasSGonza/JovemAprendizIntelbras-Lucas/tree/main/Swift)
- [Kotlin](https://github.com/LucasSGonza/JovemAprendizIntelbras-Lucas/tree/main/Kotlin)
---

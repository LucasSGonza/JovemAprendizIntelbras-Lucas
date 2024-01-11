fun main() {
    val phone = FoldablePhone()
    println("Teste 1 -- Estado inicial do phone\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
    phone.switchOn()
    println("Teste 2 -- Ligando o phone sem desdobrar\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
    phone.switchPhoneFold()
    println("Teste 3 -- Desdobrando o phone e ent ligando-o\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
    phone.switchOff()
    println("Teste 4 -- Desligando o phone e mantendo a dobra\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
    phone.switchPhoneFold()
    println("Teste 5 -- Mudando novamente a dobra do phone, agr 'fechando'\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
    phone.switchOn()
    println("Teste 6 -- Tentar ligar novamente com a tela dobrada\nIs phone screen light on: ${phone.isScreenLightOn}\nIs phone folded up: ${phone.isPhoneFoldedUp}\n")
}

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

class FoldablePhone(var isPhoneFoldedUp: Boolean = true): Phone() {
	override fun switchOn() {
        isScreenLightOn = if (isPhoneFoldedUp) false else true
    }
    
    fun switchPhoneFold() {
        isPhoneFoldedUp = if (this.isPhoneFoldedUp) false else true
        switchOn()
    }
}


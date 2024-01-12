fun main() {
   val amanda = Person("Amanda", 33, "play tennis", null)
   val silva = Person("Silva", 25, "develop with Kotlin", amanda)
   val vitinho = Person("Vitinho", 28, "climb", silva)
   val lucas = Person("Lucas", 20, "play league of legends 🤓", vitinho)
   val robin = Person("Robin", 23, "fight crime", Person("Batman", 50, "fight crime", null))

  val listOfPersons: List<Person> = mutableListOf(amanda, silva, vitinho, lucas, robin)
  listOfPersons.forEach { person ->
        person.showProfile()
   }

}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       // Fill in code
        val hobby = if (hobby == null) "Doesn't have a hobby" else "Likes to $hobby"
        
        val referrerText = if (referrer == null) "Doesn't have a referrer" else 
        "Has a referrer named ${referrer.name.capitalize()}"
        
        println("Name $name\nAge: $age\n$hobby\n$referrerText\n--------------")
    }
}
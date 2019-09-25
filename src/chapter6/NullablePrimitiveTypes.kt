package chapter6

data class PersonThree(val name: String,
                  val age: Int? = null) {

    fun isOlderThan(other: PersonThree): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(PersonThree("Sam", 35).isOlderThan(PersonThree("Amy", 42)))
    println(PersonThree("Sam", 35).isOlderThan(PersonThree("Jane")))
}
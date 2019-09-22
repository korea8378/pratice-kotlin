package chapter5

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
    people.maxBy(Person::age)
    people.filter { it.age == people.maxBy(Person::age)!!.age }

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
}
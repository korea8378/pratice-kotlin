package chapter5

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    //all
    println(people.all(canBeInClub27))
    //find
    println(people.find(canBeInClub27))

    val list = listOf(1, 2, 3)
    //부정
    println(!list.all { it == 3 })
    //any
    println(list.any { it != 3 })
}


package chapter5

fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29), Person("Carol", 31)
    )
    println(people.groupBy { it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}
package chapter5

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))

//    val sum = { x: Int, y: Int -> x + y }
//    println(sum(1, 2))

//    { println(42) }()

//    run { println(42) }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ",
        transform = { p: Person -> p.name })
    println(names)

    val list = arrayListOf(1,2)
    list += 3


}
package chapter9

open class Animal {
    fun feed() {
        println("hello")
    }
}

class Herd<T : Animal> {
    val size: Int get() = 5
}

fun <T : Animal>feedAll(animals: Herd<T>) {
    for (i in 0 until animals.size) {
        print("12")
    }
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        println("23")
        feedAll(cats)
    }
}

fun main(args: Array<String>) {
    val testHerd = Herd<Cat>()

    takeCareOfCats(testHerd)
}

//불가능
//class CatTwo {
//    fun cleanLitter() {}
//}
//
//fun takeCareOfCatTwos(cats: Herd<CatTwo>) {
//    for (i in 0 until cats.size) {
//        println("23")
//        feedAll(cats)
//    }
//}
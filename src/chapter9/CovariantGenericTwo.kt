package chapter9

open class AnimalTwo {
    fun feed() {println("hello")}
}

class HerdTwo<out T : AnimalTwo> {
    val size: Int get() = 5
}

fun feedAll(animals: HerdTwo<AnimalTwo>) {
    for (i in 0 until animals.size) {
        print("12")
    }
}

class CatTwo: AnimalTwo() {
    fun cleanLitter() {}
}

fun takeCareOfCatTwos(cats: HerdTwo<CatTwo>) {
    for (i in 0 until cats.size) {
        println("23")
        feedAll(cats)
    }
}

package chapter5

fun main(args: Array<String>) {
    //시퀀스를 만드는 또다른 방법
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}

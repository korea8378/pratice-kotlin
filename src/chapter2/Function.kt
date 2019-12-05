package chapter2

import java.util.*


fun main(args: Array<String>) {
    println(max(5, 4))

    val a: HelloOne = castTwo() as HelloOne
}


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}


//식이 본문이 함수
//fun max(a: Int, b: Int) = if (a > b) a else b


interface Hello

class HelloOne(): Hello

class HelloTwo(): Hello

fun cast(a: Hello) {
    if (a is HelloOne) {
        print(a.toString())
    } else if (a is HelloTwo) {
        print(a.toString())
    }
}

fun castTwo(): Hello = HelloOne()
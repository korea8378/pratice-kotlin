package chapter2

fun main(args: Array<String>) {
    println(max(5, 4))
}

//블록이 본문인 함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//식이 본문이 함수
//fun max(a: Int, b: Int) = if (a > b) a else b

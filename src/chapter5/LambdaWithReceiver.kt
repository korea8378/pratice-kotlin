package chapter5

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

//with 함수
//fun alphabet() = with(StringBuilder()) {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//    append("\nNow I know the alphabet!")
//    toString()
//}

//apply 함수(수신 객체를 반환)
//fun alphabet() = StringBuilder().apply {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//    append("\nNow I know the alphabet!")
//}.toString()

//buildString함수(표준 라이브러리)
//fun alphabet() = buildString {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//    append("\nNow I know the alphabet!")
//}

fun main(args: Array<String>) {
    println(alphabet())
}
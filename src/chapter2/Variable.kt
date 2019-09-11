package chapter2

fun main(args: Array<String>) {

    //변경 불가능한 참조를 저장하는 변수(java의 final)
    val languages = arrayListOf("Java")

    //변경 가능한 참조를 저장하는 변수
    var answer = 42

    val name = if (args.size > 0) args[0] else "kotlin"

    println("Hello, ${name}")
    println("Hello, ${if (args.size > 0) args[0] else "python"}")
}

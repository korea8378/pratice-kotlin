package chapter6

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

//this(수신객체)가 null이 될 수도 있다. 자바는 this가 null이 될 수 없다.
fun String?.isNullOrBlank() : Boolean =
    this == null || this.isBlank()

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}

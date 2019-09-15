package chapter4

class UserFour(val name: String) {
    var address: String = "unspecified"
    set(value: String) {
        println("""
        Address was changed for $name:
        "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun main(args: Array<String>) {
    val userFour = UserFour("Alice")
    userFour.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}

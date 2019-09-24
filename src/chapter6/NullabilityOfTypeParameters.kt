package chapter6

//T가 널이 될 수도 있다.
//fun <T> printHashCode(t: T) {
//    println(t?.hashCode())
//}

//T가 널이 될 수 없다.
fun <T: Any> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCode("test")
}

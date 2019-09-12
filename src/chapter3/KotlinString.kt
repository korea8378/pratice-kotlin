package chapter3

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun parsePathOne(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}


fun parsePathTwo(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    parsePathOne("/Users/yole/kotlin-book/chapter.adoc")

    parsePathTwo("/Users/yole/kotlin-book/chapter.adoc")

    println(kotlinLogo.trimMargin("."))
}
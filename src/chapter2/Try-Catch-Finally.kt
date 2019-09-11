package chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

//바로 종료
//fun readNumber(reader: BufferedReader) {
//    val number = try {
//        Integer.parseInt(reader.readLine())
//    } catch (e: NumberFormatException) {
//        return
//    }
//
//    println(number)
//}

//식으로 사용
//fun readNumber(reader: BufferedReader) {
//    val number = try {
//        Integer.parseInt(reader.readLine())
//    } catch (e: NumberFormatException) {
//        null
//    }
//
//    println(number)
//}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
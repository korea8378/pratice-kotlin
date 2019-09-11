package chapter2

import chapter2.Color.*

fun getWarmthByImport(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "natural"
    BLUE, INDIGO, VIOLET -> "cold"
}
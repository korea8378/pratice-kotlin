package chapter4

class ButtonTwo : ClickableTwo, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() { // 재구현
        super<ClickableTwo>.showOff()
        super<Focusable>.showOff()
    }
}

interface ClickableTwo {
    fun click() // 메서드
    fun showOff() = println("I'm clickable!") // 디폴트 메서드
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = ButtonTwo()
    button.showOff()
    button.setFocus(true)
    button.click()
}
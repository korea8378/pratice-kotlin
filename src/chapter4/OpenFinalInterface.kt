package chapter4

interface ClickableThree {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : ClickableThree { // open

    fun disable() {} // final

    open fun animate() {} // open

    //override fun click() {} // open

    final override fun click() {} // final
}
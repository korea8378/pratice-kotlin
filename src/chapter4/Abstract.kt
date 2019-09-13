package chapter4

abstract class Animated { // open, 인스턴스화 X

    abstract fun animate() // open

    open fun stopAnimating() { // open
    }

    fun animateTwice() { // final
    }
}
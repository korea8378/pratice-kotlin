package chapter4

import javax.naming.Context
import javax.swing.text.AttributeSet

//각각의 생성자가 기반 클래스의 생성자를 호출
//open class MyButton : View {
//    constructor(ctx: Context) : super(ctx){
//        …
//    }
//
//    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
//        …
//    }
//}

//하나의 생성자가 자신의 다른 생성자를 호출
//호출 된 생성자가 기반 클래스의 생성자를 호출
//open class MyButton : View {
//    constructor(ctx: Context) : this(ctx, My_STYLE){
//        …
//    }
//
//    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
//        …
//    }
//}
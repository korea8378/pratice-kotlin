package chapter2

//java
/*
public class Person{

    private String name;

    Getter...

    Setter...

}
*/

class Person(
    //읽기 전용 프로퍼티로, 코틀린은 (비공개) 필드와 필드를 읽는 단순한 (공개) 게터를 만들어낸다.
    val name: String,

    //쓸 수 있는 프로퍼티로, 코틀린은 (비공개) 필드, (공개) 게터, (공개) 세터를 만들어 낸다.
    var isMarried: Boolean
)

//커스텀 접근자
class Rectangle(var height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

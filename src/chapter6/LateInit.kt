package chapter6

import org.junit.Before
import org.junit.Test
import org.junit.Assert

//프로퍼티에 대한 null 체크를 해야한다.
//class MyService {
//    fun performAction(): String = "foo"
//}
//
//class MyTest {
//    private var myService: MyService? = null
//
//    @Before
//    fun setUp() {
//        myService = MyService()
//    }
//
//    @Test
//    fun testAction() {
//        Assert.assertEquals(
//            "foo",
//            myService!!.performAction()
//        )
//    }
//}

//나중에 초기화를 이용한 null체크가 필요가 없다.
class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    @Before fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        Assert.assertEquals("foo",
            myService.performAction())
    }
}

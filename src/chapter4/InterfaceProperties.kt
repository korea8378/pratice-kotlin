package chapter4

interface UserTwo {
    val nickname: String
}

class PrivateUser(override val nickname: String) : UserTwo

//nickname은 매번 호출될 때마다 substringBefore를 호출해 계산하는 커스텀 게터를 활용
class SubscribingUser(val email: String) : UserTwo {
    override val nickname: String
        get() = email.substringBefore('@')
}

//nickname은 객체 초기화 시 계산한 데이터를 뒷받침하는 필드에 저장했다가 불러오는 방식을 활용
//class FacebookUser(val accountId: Int) : UserTwo {
//    override val nickname = getFacebookName(accountId)
//}

//프로퍼티(nickname)에 뒷받침하는 필드가 없다. 대신 매번 계산해 돌려준다.
//nickname은 오버라이드하지 않고 상속할 수 있다.
interface UserThree {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
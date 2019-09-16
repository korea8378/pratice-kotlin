package chapter4

fun getFacebookName(accountId: Int) = "fb:$accountId"

// 확장을 하게되면 하위 클래스에서 오버라이드를 하지 못한다.그럴 경우 여러개의 생성자를 사용하는게 좋다
class UserFive private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = UserFive.newSubscribingUser("bob@gmail.com")
    val facebookUser = UserFive.newFacebookUser(4)
    println(subscribingUser.nickname)
}

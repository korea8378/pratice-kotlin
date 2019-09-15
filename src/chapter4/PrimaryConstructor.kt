package chapter4

//주 생성자와 초기화 블록
class User constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

//초기화 블록 생략
//class User constructor(_nickname: String) {
//    val nickname = _nickname
//}

//주생성자와 초기화 블록 생략
//class User (nickname: String)
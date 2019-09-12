package chapter3

//개선 전
//fun saveUser(user: User) {
//    if (user.name.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id}: empty Name")
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id}: empty Address")
//    }
//
//    // Save user to the database
//}
//
//fun main(args: Array<String>) {
//    saveUser(User(1, "", ""))
//}

//로컬 함수로 개선
//fun saveUser(user: User) {
//    fun validate(value: String, fieldName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException(
//                "Can't save user ${user.id}: " +
//                        "empty $fieldName")
//        }
//    }
//
//    validate(user.name, "Name")
//    validate(user.address, "Address")
//
//    // Save user to the database
//}
//
//fun main(args: Array<String>) {
//    saveUser(User(1, "", ""))
//}

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
package chapter5

fun main(args: Array<String>) {
    //최종 연산이 없기 때문에 아무것도 출력 되지 않는다.
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }


    //지연 연산을 통하여 원소 하나씩 map, filter를 수행한다.
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()

}
fun main() {
    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")

    doWhenToString(1)
    doWhenToString("DiMo")
    doWhenToString(12L)
    doWhenToString(3.14159)
    doWhenToString("Kotlin")
}

/**
 * Any : 어떤 자료형이든 상관없는 최상위 자료
 * 등호와 부등호의 사용은 불가
 */
fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}

fun doWhenToString(a: Any) {
    var result = when (a) {
        1 -> "정수 1입니다"
        "DiMo" -> "디모의 코틀린 강좌입니다"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result)
}

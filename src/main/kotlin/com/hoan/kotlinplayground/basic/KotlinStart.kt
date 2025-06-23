package com.hoan.kotlinplayground.basic

// 1. 기본 구조
fun main(args: Array<String>) {
    println("Hello Kotlin")
    declareVal()
    dataType()
    conditionalStatement()
    whenTest()
    println(add(1,2))
    println(sub(1,2))
    classStudy()
    nullStudy()
    collectionStudy()
    lamdaStudy()
}




// 2. 변수 선언
fun declareVal() {
    val name = "Alice"     // 변경 불가능한 변수 (immutable)
    var age = 30           // 변경 가능한 변수 (mutable)

    println("$name, $age")

    age = 20;
    println("$name, $age")
}

// 3. 자료형
fun dataType() {
    val num: Int = 10
    val pi: Double = 3.14
    val text: String = "Hi"
    val flag: Boolean = true

    /**
     *  "$pi", pi의 차이
     *
     *  "$pi"는 문자열 템플릿임.
     *  내부적으로 pi.toString()이 호출됨
     *
     *  pi는 Double 타입임.
     *  System.out.println(double)이 호출됨
     */
    println("$num")
    println("$pi")
    println(pi)
    println(text)
    println(if (flag) "Yes" else "No")
}

// 4. 조건문
fun conditionalStatement() {
    val score = 85
    val grade = if (score >= 90) "A" else "B"
    println("$grade $score")
}

// 5. when (Java의 switch와 비슷)
fun whenTest() {
    val grade = 85
    val result = when (grade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
    println("학점: $result")

}

// 5. 함수
fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b


// 6. 클래스
class Person(val name: String, var age: Int)

fun classStudy() {
    val p = Person("John", 30)

    println(p.name)
}

// 7. null
fun nullStudy() {
    var str: String? = null  // ?를 붙이면 null 허용
    val length = str?.length ?: 0  // 안전 호출 + 기본값 설정

    println(length)
}

// 8. 컬렉션
fun collectionStudy() {
    val list = listOf("A", "B", "C")        // 읽기 전용 리스트
    val mutableList = mutableListOf("X")   // 수정 가능한 리스트

    for (item in list) {
        println(item)
    }

    for (item in mutableList) {
        println(item)
    }
}

// 9. 람다식
fun lamdaStudy() {
    val square = { x: Int -> x * x }
    println(square(4))  // 16


}



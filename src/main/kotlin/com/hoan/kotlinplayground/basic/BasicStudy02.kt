package com.hoan.kotlinplayground.basic

// 1. 제어 흐름 + 컬렉션 응용
// forEach, map, filter, reduce 등 고차 함수 사용법 익히기
// 리스트, 셋, 맵 등 컬렉션 처리 심화

fun main(args: Array<String>) {
    controlFlowAndCollectionStudy()
    nextCollectionStudy()
}

fun controlFlowAndCollectionStudy() {
    val names = listOf("Tom", "Jane", "Sue", "Jo")
    val upper = names.map { it.uppercase() }.filter { it.startsWith("J") }

    println(upper)
}

fun nextCollectionStudy() {
    val people = listOf("Tom", "Jane", "Sue", "Jo", "Jack")

    // flatMap: 이름을 한 글자씩 분리 후, 중복 제거
    val uniqueLetters = people.flatMap { it.toList() }.distinct()
    println("Unique letters: $uniqueLetters")

    // groupBy: 이름의 길이로 그룹화
    val groupedByLength = people.groupBy { it.length }
    println("Grouped by length: $groupedByLength")

    // associate: 이름을 키, 길이를 값으로 하는 맵 생성
    val nameToLength = people.associate { it to it.length }
    println("Name to length map: $nameToLength")
}
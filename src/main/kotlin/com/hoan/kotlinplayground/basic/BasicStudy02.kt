package com.hoan.kotlinplayground.basic

// 1. 제어 흐름 + 컬렉션 응용
// forEach, map, filter, reduce 등 고차 함수 사용법 익히기

// 리스트, 셋, 맵 등 컬렉션 처리 심화

fun main(args: Array<String>) {
    controlFlowAndCollectionStudy()
}

fun controlFlowAndCollectionStudy() {
    val names = listOf("Tom", "Jane", "Sue")
    val upper = names.map { it.uppercase() }.filter { it.startsWith("J") }

    println(upper)
}
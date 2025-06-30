package com.hoan.kotlinplayground.basic

fun main(args: Array<String>) {
    printLength("Hello")  // 문자열 길이: 5



}

fun printLength(obj: Any) {
    if (obj is String) {
        println(obj.length) // obj가 String임을 검사했기 때문에 자동으로 String으로 취급
    }
}


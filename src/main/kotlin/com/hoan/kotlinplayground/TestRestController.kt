package com.hoan.kotlinplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestRestController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello";
    }
}
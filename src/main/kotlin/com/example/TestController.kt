package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class TestController(
) {
    @Get("/")
    fun testGet(): HttpResponse<*> {
        return HttpResponse.ok("Hello from Get")
    }
}
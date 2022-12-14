package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import java.time.Duration


fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSecond = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "Public, max-args=$oneYearInSecond, immutable"
        )
    }
}
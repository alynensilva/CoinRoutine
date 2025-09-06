package com.eepycat.koinroutine

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
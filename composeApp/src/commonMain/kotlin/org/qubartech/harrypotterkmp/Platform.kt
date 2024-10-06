package org.qubartech.harrypotterkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.gnr.proyectod1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
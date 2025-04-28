package com.github.adambananka.wahootogarmin

import com.github.adambananka.wahootogarmin.core.Base

fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    for (i in 1..5) {
        println("i = $i")
    }
    println(Base().getMessage())
}
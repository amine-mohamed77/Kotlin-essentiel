package com.example.kotlin_essentiel

fun main() {

    val appName = "KotlinEssentiel"
    var count = 3
    val version = 1

    println("Name app: $appName, version=$version, count=$count")


    println("Level for count=$count → ${levelLabel(count)}")


    val n = 5
    println("Sum of 0 à $n = ${sum0to(n)}")
}


fun levelLabel(count: Int): String = when {
    count < 0  -> "Invalids"
    count == 0 -> "Beginning"
    count in 1..9 -> "Bas"
    count in 10..99 -> "AVERAGE"
    else -> "Pupil"
}


fun sum0to(n: Int): Int {
    require(n >= 0) { "n must be positive" }
    var s = 0
    for (i in 0..n) {
        s += i
    }
    return s
}

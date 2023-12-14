package com.example.oo

/**
 * 7. Создайте класс MathUtils и перегрузите функцию add(), чтобы она могла принимать два
 * или три целых числа.
 */
class MathUtils() {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

fun main() {
    var ein = MathUtils()
    var zwei = MathUtils()
    println(ein.add(3, 8))
    println(zwei.add(44, -6, 2))
}

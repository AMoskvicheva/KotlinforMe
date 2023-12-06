package com.example.oo

/**
 * 7. Создайте класс MathUtils и перегрузите функцию add(), чтобы она могла принимать два
 * или три целых числа.
 */
class MathUtils() {
    fun add(a: Int, b: Int) {
        var sum: Int = a + b
        println(sum)
    }

    fun add(a: Int, b: Int, c: Int) {
        var sum: Int = a + b + c
        println(sum)
    }
}

fun main() {
    var ein = MathUtils()
    var zwei = MathUtils()
    ein.add(3, 8)
    zwei.add(44, -6, 2)

}
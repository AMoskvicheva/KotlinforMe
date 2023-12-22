package com.example

/**
 * 8. Создайте абстрактный класс Shape с абстрактным методом area(), затем создайте классы Circle и
 * Rectangle, реализующие этот метод. Создайте объекты Circle и Rectangle и выведите их площадь.
 */
abstract class Shape() {
    abstract fun area(a: Int, h: Int): Int
}

class Circle() : Shape() {
    override fun area(a: Int, h: Int): Int {
        var d = a * a
        var s: Int = 3 * d
        return s
    }
}

class Rectangle() : Shape() {
    override fun area(a: Int, h: Int): Int {
        var s: Int = a * h
        return s
    }
}

fun main() {
    var redCircle = Circle()
    println(redCircle.area(5, 0))
    var blueRectangle = Rectangle()
    println(blueRectangle.area(9, 4))
}
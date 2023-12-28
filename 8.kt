package com.example

/**
 * 8. Создайте абстрактный класс Shape с абстрактным методом area(), затем создайте классы Circle и
 * Rectangle, реализующие этот метод. Создайте объекты Circle и Rectangle и выведите их площадь.
 */

abstract class Shape() {
    abstract fun area(): Double
}

class Circle(val r: Double) : Shape() {
    override fun area(): Double {
        val s: Double = kotlin.math.PI * r * r
        return s
    }
}

class Rectangle(val a: Double, val b: Double) : Shape() {
    override fun area(): Double {
        val s: Double = a * b
        return s
    }
}

fun main() {
    val circle = Circle(4.0)
    println(circle.area())
    val rectangle = Rectangle(9.5, 4.0)
    println(rectangle.area())
}

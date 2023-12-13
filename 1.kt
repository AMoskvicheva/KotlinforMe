package com.example.oo

/**
 * 1. Создайте класс Car с полями model, color, year и методом drive().Создайте несколько объектов
 * этого класса и вызовите их метод drive().
 */
open class Car(model: String, color: String, year: String) {
    var m = model
    var c = color
    var y = year
    fun drive() {
        println("Поехала машина $m $c $y")
    }
}

fun main() {
    val myCar1 = Car("Priora", "violet", "2000")
    val myCar2 = Car("Niva", "white", "1987")
    val myCar3 = Car("Volkswagen", "red", "2023")
    myCar1.drive()
    myCar2.drive()
    myCar3.drive()
}



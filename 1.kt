package com.example.oo

/**
 * 1. Создайте класс Car с полями model, color, year и методом drive().Создайте несколько объектов
 * этого класса и вызовите их метод drive().
 */
open class Car {
    var model = "Niva"
    var color = "White"
    var year = "2010"
    fun drive() {
        println("$model $color $year поехала")
    }
}

fun main() {
    val myCar1 = Car() // экземпляры класса мы всегда добавляем вне класса?
    myCar1.drive()
    val myCar2 = Car()
    myCar2.model = "Priora"
    myCar2.color = "Violet"
    myCar2.year = "2000"
    myCar2.drive()
    val myCar3 = Car()
    myCar3.model = "Volga"
    myCar3.color = "Black"
    myCar3.year = "1970"
    myCar3.drive()
}



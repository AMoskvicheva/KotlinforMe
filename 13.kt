package com.example

/**
 * 13. Создайте классы Engine и Tires. Затем создайте класс Car, который получает Engine и Tires
 * через конструктор (Dependency Injection).
 */
class Engine() {
    fun drive() {
        println("врум-врум")
    }
}

class Tires() {
    fun spin() {
        println("круть-круть")
    }
}

class Car(val driv: Engine, val spi: Tires) {

}

fun main() {
    val nivaEngine = Engine()
    val nivaTires = Tires()
    val niva = Car(nivaEngine, nivaTires)
    niva.driv.drive()
    niva.spi.spin()
}
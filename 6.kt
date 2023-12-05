package com.example.oo

/**
 * 6. Создайте класс Animal с методом makeSound(), затем создайте классы Dog и Cat, наследующие от
 * Animal, и переопределите метод makeSound(). Создайте объекты Dog и Cat и вызовите
 * их методы makeSound().
 */

open class Animal() {
    open fun makeSound() { // функции по умолчанию final
        println("какой-то звериный звук")
    }
}

fun main() {
    class Cat : Animal() {

        override fun makeSound() {
            println("мяу-мяу")
        }
    }

    class Dog : Animal() {
        override fun makeSound() {
            println("гау-гау")
        }
    }

    val anyAnimal = Animal()
    anyAnimal.makeSound()
    val kitty = Cat()
    kitty.makeSound()
    val rex = Dog()
    rex.makeSound()
}
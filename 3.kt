package com.example.oo

/**
 * 3. Создайте объект Singleton с методом printMessage(), который выводит любое сообщение.
 * Вызовите этот метод.
 */
fun main() {
    Singleton.printMessage()
}

object Singleton {
    fun printMessage() {
        println("Я Singleton, но я не одинок.")
    }
}

package com

/**
 * 5. Создайте пользовательское исключение InvalidUserInputException, которое выбрасывается,
 * когда пользователь вводит что-то неверное. Покажите, как его можно перехватить и обработать.
 */

class InvalidUserInputException(message: String) : Exception(message)

fun main() {
    try {
        println("Оцените наше приложение от 1 до 5")
        val userInput: Int? = readLine()?.toInt()

        if (userInput != 5 && userInput != 4) {
            throw InvalidUserInputException("Вы вводите что-то неверное")
        } else println("Спасибо за оценку:)")

    } catch (e: InvalidUserInputException) {
        println("Ошибка: ${e.message}")
    }
}
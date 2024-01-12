package com.example

/**
 * 10. Создайте data class User с двумя свойствами и методом printInfo(), который выводит информацию
 * о пользователе. Создайте объект User и вызовите его метод printInfo().
 */
data class User(var name: String, var age: Int) {
    fun printInfo() {
        println("Имя пользователя:$name, возраст:$age")
    }
}

fun main() {
    var user = User("Игорь", 18)
    user.printInfo()
}
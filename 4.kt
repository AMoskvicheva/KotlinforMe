package com.example.oo

/**
 * 4. Создайте класс Person с приватными свойствами name, age и публичными методами getName()
 * и getAge(). Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
     * Придётся закомментить: ошибка Cannot access 'name': it is private in 'Person'
     * fun main() {
     *    val Iam = Person()
     *    Iam.getName()
     *    Iam.name = "Anastasiya"
     *    Iam.getName()}
     */
class Person {
    private var name = "Nastya"
    private var age = 30
    fun getName() {
        println("Меня зовут $name")
    }

    fun getAge() {
        println("Мне $age лет")
    }
}
package com.example.oo

/**
 * 4. Создайте класс Person с приватными свойствами name, age и публичными методами getName()
 * и getAge(). Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */
class Person(private var name: String, private var age: Int) {
    fun getName() {
        println("Меня зовут $name")
    }

    fun getAge() {
        println("Мне $age лет")
    }
}

fun main() {
    val Iam = Person("Anastasiya", 30)
    Iam.getName()
    Iam.getAge()
    var privAge = Iam.age // Cannot access 'age': it is private in 'Person'
    println(privAge)
}

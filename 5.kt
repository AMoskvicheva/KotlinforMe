package com.example.oo

/** 5. В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 * Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.Например, вы можете
 * реализовать проверку возраста в сеттере, чтобы убедиться, что возраст неотрицательный.
 */
fun main() {
    val sant = Person2()
    sant.name = "Santa"
    println(sant.name)
    val old = Person2()
    old.age = 75
    println(old.age)
    old.age = -90 //не поменяется потому что есть проверка на отрицательное число
    println(old.age)

}

class Person2 {
    var name: String = "Person"
        set(value) {
            println("Использую сеттер")
            field = value
        }
        get() {
            println("Использую геттер")
            return field
        }
    var age: Int = 75
        set(value) {
            println("Использую сеттер для age")
            if (value > 0) {
                field = value
            }
        }
        get() {
            println("Использую геттер для age")
            return field
        }
}

package com

/**
 * 5. Создайте объект класса Person со свойствами name и age. Создайте список из нескольких
 * таких объектов. Используйте filter и map чтобы получить список имен тех людей,
 * которым больше 18 лет.
 */
class Person(var name: String, var age: Int) {

}

val pers1 = Person("Master", 38)
val pers2 = Person("Margarita", 30)
val pers3 = Person("Voland", 65)
val pers4 = Person("Kot-begemot", 12)
val pers5 = Person("Yeshua", 27)
val pers6 = Person("Azazello", 40)
val pers7 = Person("Frida", 17)
val vse: MutableList<Person> = mutableListOf(pers1, pers2, pers3, pers4, pers5, pers6, pers7)
val filtervse = vse.filter { it.age > 18 }.map { it.name }
fun main() {
    println(filtervse)
}

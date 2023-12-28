package com.example

/**
 * 12. Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(),а
 * в классе CanFly - метод fly(). Затем создайте класс Bat, который сочетает в себе оба этих
 * поведения (с помощью композиции).
 */
class Mammal() {
    fun breastfeed() {
        println("Кормлю своих детей молоком")
    }
}

class CanFly() {
    fun fly() {
        println("Умею летать")
    }
}

class Bat() {
    val eatmilk = Mammal()
    val flyable = CanFly()
}

fun main() {
    val tipicalBat = Bat()
    tipicalBat.eatmilk.breastfeed()
    tipicalBat.flyable.fly()
}

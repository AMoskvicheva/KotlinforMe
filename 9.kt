package com.example

/**
 * 9. Создайте интерфейс Flyable с методом fly() и интерфейс Navigable  с методом navigate(),
 * затем создайте классы Bird и Airplane, реализующие эти интерфейсы. Создайте объекты Bird
 * и Airplane и вызовите их методы fly() и navigate().
 */
interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird() : Flyable, Navigable {
    override fun fly() {
        println("Птички летают крыльями махают (машут)")
    }

    override fun navigate() {
        println(
            "Птицы имеют магнитный, звездный и солнечный компасы для того, чтобы определять " +
                    "направление полета во время миграции."
        )
    }
}

class Airplane() : Flyable, Navigable {
    override fun fly() {
        println("Самолёт движется за счет тяги от реактивного/ракетного двигателя")
    }

    override fun navigate() {
        println(
            "Современная спутниковая навигация основывается на использовании принципа " +
                    "беззапросных дальномерных измерений между навигационными спутниками и потребителем. "
        )
    }
}

fun main() {
    var sorokaBeloboka = Bird()
    var boing = Airplane()
    sorokaBeloboka.fly()
    sorokaBeloboka.navigate()
    boing.fly()
    boing.navigate()
}

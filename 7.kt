package com

/**
 * 7. Создайте класс Car с полями make, model и year. Создайте коллекцию из
 * нескольких объектов этого класса и используйте groupBy чтобы сгруппировать машины по году выпуска.
 */
class Car(val make: String, val model: String, val year: Int) {
    override fun toString(): String {
        return "$make $model"
    }
}

val car1 = Car("Toyota", "Camry", 2021)
val car2 = Car("BMW", "X5", 2011)
val car3 = Car("Sckoda", "Octavia", 2011)
val car4 = Car("Audi", "A6", 2021)
val car5 = Car("Lada", "Priora", 2011)
val car6 = Car("Lada", "Niva", 2021)
val car7 = Car("Haval", "M6", 2023)
val car8 = Car("JETOUR", "X70", 2023)
val collection: MutableList<Car> = mutableListOf(car1, car2, car3, car4, car5, car6, car7, car8)
val new = collection.groupBy { it.year }
fun main() {
    println(new)
}
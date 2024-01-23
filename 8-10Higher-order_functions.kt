package com

/**
 * 8. Создайте переменную lazyValue типа String, инициализируемую лениво.
 * Проверьте, что инициализация действительно происходит только при первом обращении к переменной.
 */
val lazyValue: String by lazy {
    println("Вычисляю и кэширую")
    "Hello"
}

fun main() {
    println("Первое обращение $lazyValue")
    println("Второе обращение $lazyValue")
    //далее выводится задание 9
    println(operation1)
    println(operation2)
    println(operation3)
    //10 задание
    println(sum)
    println(sum2)
    println(min)
    println(max)
    println(minFold)
    println(maxFold)
}

/**
 * 9. Создайте функцию высшего порядка calculate, которая принимает два целых числа и функцию
 * операции.Продемонстрируйте использование calculate с разными операциями
 * (сложение, вычитание, умножение).
 */
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val operation1 = calculate(1, 2) { a, b -> a + b }
val operation2 = calculate(7, 9) { a, b -> a - b }
val operation3 = calculate(7, 3) { a, b -> a * b }

/**
 * 10. Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму,
 * минимальное и максимальное значения.
 */
val chisla = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val sum = chisla.reduce { acc, i -> acc + i }
val sum2 = chisla.fold(0) { acc, i -> acc + i }
val min = chisla.reduce { acc, i -> if (i < acc) i else acc }
val max = chisla.reduce { acc, i -> if (i > acc) i else acc }
val minFold = chisla.fold(2) { acc, i -> if (i < acc) i else acc }
val maxFold = chisla.fold(1) { acc, i -> if (i > acc) i else acc }

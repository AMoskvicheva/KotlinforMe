package com

/**
 * 1. Создайте список чисел от 1 до 10, затем используйте метод filter чтобы
 * оставить только четные числа. После этого используйте метод map чтобы умножить каждое число на 2.
 */
fun main() {
    val spisok = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sortSpisok = spisok.filter { it % 2 == 0 }
    println(sortSpisok)
    val dublSpisok = spisok.map { it * 2 }
    println(dublSpisok)
    //далее выводятся следующие задания
    printLength()
    println(lambdaResult)
    println(lambdaResult2)
}

/**
 * 2. Создайте список строк [“один”, “два”, “три”, “четыре”, “пять”]. Используйте map чтобы
 * получить длину каждого элемента списка.
 */
val spisochek = listOf("один", "два", "три", "четыре", "пять")
val length = spisochek.map { it.length }
fun printLength() {
    println(length)
}

/**
 * 3. Напишите функцию высшего порядка, которая принимает два параметра: целое число и функцию,
 * принимающую целое число и возвращающую строку. Эта функция должна преобразовывать число в
 * строку с помощью переданной функции и возвращать результат.
 */
fun high(num: Int, lambda: (Int) -> String): String {
    return lambda(num)
}

val lambdaResult = high(6) { number: Int -> number.toString() }

/**
 * 4. Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
 * Используйте эту лямбда-функцию в другой функции, которая принимает число и возвращает строку,
 * состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
 */
fun kvadratisch(chi: Int, lambda2: (Int) -> Int): String {
    val kvadrat = lambda2(chi)
    return "$chi - его квадрат равен $kvadrat"

}

val lambdaResult2 = kvadratisch(9) { chislo: Int -> chislo * chislo }

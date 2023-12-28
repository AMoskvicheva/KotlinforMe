package com.example

/**
 * 11. Создайте sealed class MathOperation и несколько объектов, представляющих различные
 * математические операции (например, Add, Subtract, Multiply, Divide). Создайте функцию,
 * которая принимает MathOperation и два числа, и выполняет соответствующую операцию.
 */
sealed class MathOperation {
    object Add : MathOperation()
    object Subtract : MathOperation()
    object Multiply : MathOperation()
    object Divide : MathOperation()
}

fun schitalka(operation: MathOperation, a: Int, b: Int): Int? {
    when (operation) {
        MathOperation.Add -> return a + b
        MathOperation.Subtract -> return a - b
        MathOperation.Multiply -> return a * b
        MathOperation.Divide -> try {
            return a / b
        } catch (e: ArithmeticException) {
            println("на ноль делить нельзя")
            return null
        }
    }
}
fun main() {
    val resultAdd = schitalka(MathOperation.Add, 8, 8)
    println(resultAdd)
    val resultSubtract = schitalka(MathOperation.Subtract, 800, 8)
    println(resultSubtract)
    val resultMultiply = schitalka(MathOperation.Multiply, 3, 10)
    println(resultMultiply)
    val resultDivide = schitalka(MathOperation.Divide, 100, 10)
    println(resultDivide)
}

package com

/**
 * 6. Используя ленивые операции, создайте последовательность чисел от 1 до 1000, затем используйте
 * filter чтобы оставить только числа, делящиеся на 5, затем map чтобы умножить каждое число на 2,
 * и take чтобы взять первые 20 элементов этой последовательности.
 */
val sequence = sequence {
    var num = 0
    while (num < 1001) {
        yield(num++)
    }
}
val filtSeq = sequence
    .filter { it % 5 == 0 }
    .map { it * 2 }
    .take(20)
    .toList()

fun main() {
    println(filtSeq)
}

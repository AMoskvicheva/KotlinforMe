/**
 * Напишите функцию, которая принимает массив чисел и возвращает сумму только тех чисел, 
 * которые больше 10. Если обнаруживается число меньше 0, функция должна немедленно прекратить 
 * обработку и вернуть текущую сумму (используйте return).
 */
fun main() {
    println(summator(arrayOf<Int>()))
    zikl()
}

fun summator(myArray: Array<Int>): Int? {
    var myArray = arrayOf<Int>(1, 18, 1555, 1, 10, -11)
    var sum = 0
    for (i in myArray) {
        if (i > 10) {
            sum += i
        } else if (i < 0) return sum
    }
    return sum
}

//Напишите цикл, который выводит числа от 1 до 10, но пропускает числа 3 и 7 (используйте continue).

fun zikl() {
    vne@ for (i in 1..10) {
        if ((i == 3) || (i == 7)) {
            continue
        }
        println(i)
    }
}

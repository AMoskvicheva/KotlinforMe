package com

/**
 * 1. Вам дан код: val a: String? = null. Каковы способы, которыми вы можете обратиться к a
 * без вызова исключения NullPointerException?
 */
fun main() {
    val a: String? = null
    println(a)
    //Безопасный вызов (Safe Call)
    val length = a?.length
    println(length)
    //Элвис оператор
    val length2 = a?.length ?: "пустота"
    println(length2)
    // явная проверка на 0
    if (a != null) {
        val length3 = a.length
        println(length3)
    }

    /**
     * 2. Дан код. Что будет выведено в результате выполнения этого кода? Почему?
     */

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)

    /** Ответ: Будет выведено [1, 2, 4]. List<Int?> означает, что в коллекции могут быть элементы
     * типа Int и null. intList - это новый список, который содержит только ненулевые элементы
     * из nullableList, с помощью filterNotNull(). Эта функция перебирает каждый элемент
     * исходного списка и возвращает новый список, который содержит только те элементы,
     * которые не равны null
     */

    /**
     * 3. Вам дан код: var s: String? = null.
     * Преобразуйте его в ненулевое значение с помощью оператора elvis,
     * чтобы вместо null было значение "empty".
     */
    var s: String? = null
    var elvis = s ?: "empty"
    println(elvis)

    /**
     * 4. Создайте функцию, которая принимает nullable параметр и использует оператор !! для
     * преобразования его в ненулевое значение. Что произойдет, если вы вызовете эту функцию с null?
     */

    fun nolik(d: Int?, b: Int): Int {
        return b + d!!
    }
    println(nolik(3, 4))
    //println(nolik(null, 9)) //NullPointerException
}

fun main() {
    println("Введите целое число")
    /**
     * Результат функции println всегда представляет объект типа String.
     * Поэтому надо преобразовать строку в целое число. Если ввести что-то кроме целого числа,
     * то будет ошибка NumberFormatException
     */
    try {
        var input = readLine()?.toInt()
    } catch (e: NumberFormatException) {

        println("такое себе целое число")
        return
        /**
         * Не знаю куда return засунуть. Получилось методом тыка. Была цель - после введения не
         * целого числа последующий код не должен выполнятся - это работает. Но еще мне хотелось,
         * чтобы при введении целого числа повторный ввод не запрашивался - не получилось.
         * Если удалить обработку исключения, то будет 1 раз запрашиваться как положено.
         */
    }
    var input = readLine()?.toInt() //преобразование строки
    var a = input
    if (a != null && a > 0) {
        println("вы ввели положительное число")
    }
    else if (a != null && a < 0) {
        println("вы ввели отрицательное число")
    }
    else if (a == 0) {
        println("вы ввели 0")
    }
}

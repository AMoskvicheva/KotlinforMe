/** Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов
 * и возвращает наибольшее число.Затем, используйте эту функцию для поиска максимального числа из
 * двух разных пар чисел.
 */
fun main() {
    maxOfTwo(6, -6)
    maxOfTwo(50, 50)
}

fun maxOfTwo(a: Int, b: Int) {
    if (a > b) {
        println(a)
    } else if (b == a) {
        println("числа равны")
    } else {
        println(b)
    }
}

/**
 * Задание 2: Создайте функцию sayHello, которая принимает строковый аргумент name и возвращает 
 * приветственное сообщение.Функция должна иметь параметр по умолчанию "мир". Затем вызовите функцию 
 * дважды: с именем и без имени.
 */
fun main () {
    sayHello()
    sayHello("Настя")
}
fun sayHello(name: String = "мир") {
    println("Привет, $name!")
}
/**
 * Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true,
 * если первое число больше второго, и false в противном случае.
 * Затем используйте эту функцию, сравнив две пары чисел.
 */
fun main() {
    println(10 isGreater 7)
    println(1 isGreater 8)
}

infix fun Int.isGreater(a: Int): Boolean {
    return (this > a)

}

/** Задание 4: Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
 * генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации.
 */
fun main() {
    generateSequence(1000)
}

tailrec fun generateSequence(n: Int, i: Int = 1) {
    println(i)
    if (i == n) {  // base case
        return
    } else {
        generateSequence(n, i + 1) // recursive case
    }
}
/**
 * Задание 5:Создайте список имен и используйте функции let, run, also, apply и with для выполнения
 * различных операций над этим списком (например, добавьте имя, удалите имя, переверните список).
 */
fun main() {
    var twilight = mutableListOf("Bella", "Edward", "Jacob", "Rosalie", "Alice", "Jasper")
    twilight.let {
        println("Элементы списка до добавления нового: $it")
        it.add("Victoria")
        println("С новым элементом:$it")
    }
    twilight.run {
        this.remove("Victoria")
        println("Минус Виктория: $this")
    }
    twilight
        .also { println("Уберем первых двух: ${it.drop(2)}") } // Убрать элемент по номеру
        .add("Aro")
    println("Со злодеем из второй части: $twilight")

    twilight
        .apply { this.reverse() } // Развернуть элементы списка
    println("Кто был последним станет первым: $twilight")

    with(twilight) {
        println(this.subList(5,7)) //Получение части списка по указанному диапазону(не включительно)
    }
}

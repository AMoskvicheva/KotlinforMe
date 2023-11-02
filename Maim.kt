fun main () {
    println("Hello, World!")
    val myName: String = "Nastya"
    val mySurname: String = "Moskvicheva"
    val myAge: Int = 30
    val tellTheTruth: Boolean = true
    val myArray = arrayOf<Int>(1, 2, 3, 4, 5) //массив элементов
println (myName)
println (mySurname)
println (myAge)
println(tellTheTruth)
println(myArray[0]) //вывести  значение 1 элемента из массива
    val a = 2
    val b = 22
    var c = 900
    println(a+b) //арифметические операторы
    println(a>b) //операторы сравнения
    println(a<b)
    println(b/a)
    println((a + b) < (a + c))
    println((a < b) && (b < c)) //логические операторы
    println("Привет! Меня зовут $myName $mySurname и я закончила вводный блок заданий")

    /**
     * сейчас еще запрошу у пользователя ввод из консоли, сохраню его в переменную
     * и затем выведу эту переменную на экран
     */
    println("Поздоровайся:")
    val input = readLine() // Считывает строку из стандартного ввода
    println("И тебе $input")
}

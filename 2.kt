package com.example.oo

/**
 * 2. Создайте enum class DayOfWeek, содержащий все дни недели. Выведите все дни недели,
 * используя свойства values и name этого enum.
 */
fun main() {
for (day in DayOfWeek.values()) // использую свойство values (вспомогательную функцию?)
println(day)
println(DayOfWeek.Monday.ordinal) // свойство ordinal возвращает порядковый номер константы
println(DayOfWeek.Monday.name) // использую свойство name
println(DayOfWeek.Tuesday.name)
var day = DayOfWeek.Wednesday.name
var day2 = DayOfWeek.Wednesday.ukr //ukr - свойство определенное в конструкторе класса
println("$day в переводе на украинский - $day2")
/** Почему не получилось переопределить ? var day = DayOfWeek.Thursday.name
 * Conflicting declarations: var day: String, var day: String
 */
var day3 = DayOfWeek.Thursday.name
var day4 = DayOfWeek.Thursday.ukr
println("$day3 в переводе на украинский - $day4")
println(DayOfWeek.Friday.name)
println(DayOfWeek.Saturday.name)
println(DayOfWeek.Sunday.name)}

enum class DayOfWeek ( var ukr: String ) {
    Monday ( "Понеділок"),
    Tuesday ("Вівторок"),
    Wednesday ( "Середа"),
    Thursday  ("Четвер"),
    Friday ( "П'ятниця"),
    Saturday ("Субота"),
    Sunday ("Неділя");

}

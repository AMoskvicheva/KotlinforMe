package com.example

/**
 * 14. Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения
 * (save(item: T)), удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
 * Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */
interface Repository<T> {
    fun save(item: T) {

    }

    fun delete(item: T) {
    }

    fun getAll(): List<T> {
        var polsovateli = mutableListOf<T>()
        return polsovateli
    }
}

class UserRepository() : Repository<Users> {
    var polsovateli = mutableListOf<Users>()
    override fun save(item: Users) {
        polsovateli.add(item)
    }

    override fun delete(item: Users) {
        polsovateli.remove(item)
    }

    override fun getAll(): List<Users> {
        return polsovateli
    }
}

class Users(var name: String) {
    override fun toString(): String {
        return "$name"
    }
}

fun main() {
    var pers1 = Users("Santa Claus")
    var pers2 = Users("Ded Moroz")
    var pers3 = Users("Snegurochka")
    val userRepository = UserRepository()
    userRepository.save(pers1)
    userRepository.save(pers2)
    userRepository.save(pers3)
    println(userRepository.getAll())
}
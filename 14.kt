package com.example

/**
 * 14. Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения
 * (save(item: T)), удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
 * Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */
interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

class UserRepository(private val polsovateli: MutableList<Users> = mutableListOf()) :
    Repository<Users> {
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

class Users(val name: String) {
    override fun toString(): String {
        return "$name"
    }
}

fun main() {
    val pers1 = Users("Santa Claus")
    val pers2 = Users("Ded Moroz")
    val pers3 = Users("Snegurochka")
    val userRepository = UserRepository(mutableListOf<Users>())
    userRepository.save(pers1)
    userRepository.save(pers2)
    userRepository.save(pers3)
    println(userRepository.getAll())
}

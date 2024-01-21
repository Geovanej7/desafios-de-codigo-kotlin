package Singleton

class User(val id: Int, val name: String)

object UserManager {
    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val user = User(users.size + 1, name)
        users.add(user)
    }

    fun listUsers(): List<User> {
        return users
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    val userList = UserManager.listUsers()
    for (user in userList) {
        println("User ${user.id}: ${user.name}")
    }
}
package Singleton

//classe chamada User que recebe duas variáveis imutáveis id e name
class User(val id: Int, val name: String)

//criando um objeto chamado UserManager usando a palavra-chave object.
//Isso cria uma instância única da classe, implementando o padrão Singleton.

object UserManager {

//users é uma lista mutável que armazenará instâncias da classe User.

    private val users = mutableListOf<User>()

    fun addUser(name: String) {
        val user = User(users.size + 1, name)
        users.add(user)
    }

    fun listUsers(): List<User> {
        return users
    }

// O método addUser adiciona um novo usuário à lista, criando uma instância de User com um ID único baseado no tamanho atual da lista.
// O método listUsers retorna a lista de usuários.
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

//recebendo a quantidade de usuários que serão adicionados

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

//Um loop for é utilizado para iterar sobre a quantidade especificada de usuários.
//Dentro do loop, ele lê o nome do usuário e adiciona a lista

    val userList = UserManager.listUsers()

    for (user in userList) {
        println("User ${user.id}: ${user.name}")
    }

//Mais um loop for é utilizado, agora para correr a lista de usuários e imprimir na tela
}
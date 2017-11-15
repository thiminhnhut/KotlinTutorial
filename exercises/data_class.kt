fun main(args: Array<String>) {
    data class User(var username: String, var password: String)

    var user1 = User("Nguyen Van A", "123")
    println("User 1: " + user1)
    println("User 1: " + user1.username)
    println("User 1: " + user1.password)
    println("\n")

    var user2 = User(username = "Nguyen Van C",password = "123567")
    println("User 2: " + user2)
    println("User 2: " + user2.username)
    println("User 2: " + user2.password)
    println("\n")

    var user3 = user2.copy()
    println("User 3: " + user3)
    println("User 3: " + user3.username)
    println("User 3: " + user3.password)
    println("\n")

    var user4 = user2.copy(password = "00000")
    println("User 4: " + user4)
    println("User 4: " + user4.username)
    println("User 4: " + user4.password)
}

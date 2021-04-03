package tag.cp

import tag.cp.gameobjects.*

object Game {
    fun init() {
        // Name block
        do {
            print("Please enter your name: ")
            User.name = readLine() ?: ""
        } while(User.name.isBlank())

        // Rules block
        println("Hi ${User.name}!\nWelcome to CharPack planet.\nHere you can get characters and send them into battle. GLHF!")
    }

    fun checkCommand(command: String) {

    }
}

private object User {
    var name: String = ""
    val characters: MutableList<Character> = mutableListOf()
    val packs: MutableList<Pack> = mutableListOf()
}
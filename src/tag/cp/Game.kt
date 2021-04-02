package tag.cp

import tag.cp.gameobjects.*

object Game {
    fun init() {
        println("Hello!")
        do {
            println("Please enter your name")
            User.name = readLine() ?: ""
        } while(User.name.isBlank())


    }
}

private object User {
    var name: String = ""
    val characters: MutableList<Character> = mutableListOf()
    val packs: MutableList<Pack> = mutableListOf()
}
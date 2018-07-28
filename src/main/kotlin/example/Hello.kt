package example

import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val user = User()
    user.name = "Delegate"
    println(user.name)
}

class User {
    var name by hello("Kotlin")
}

class hello(initValue: String) {
    private var value = initValue

    operator fun getValue(thisRef: User, property: KProperty<*>): String {
        return "Hello, $value!"
    }

    operator fun setValue(thisRef: User, property: KProperty<*>, newValue: String) {
        value = newValue
    }
}

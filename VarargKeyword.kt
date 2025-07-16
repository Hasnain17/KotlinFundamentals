fun main() {
        val result1 = concatenateStrings("Hello", "World")
        val result2 = concatenateStrings("Kotlin", "is", "awesome","Hasnain", "Dunyia")

        println(result1) // Output: Hello World
        println(result2) // Output: Kotlin is awesome
    }
    fun concatenateStrings(vararg strings: String): String {
        return strings.joinToString(separator = " ")
    }

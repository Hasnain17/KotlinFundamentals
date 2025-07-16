fun main(){
    data class Person(val name: String, val age: Int)

    // destructuring declarations
    val (username, userAge) = Person("vamsi", 33)
    println(username) // vamsi
    println(userAge)

    // Destructuring declaration with a Pair
    val (xCoord, yCoord) = getCoordinates()

    // Using the extracted values
    println("xCoord: $xCoord, yCoord: $yCoord")

}

fun getCoordinates(): Pair<Int, Int> {
    return Pair(30, 40)
}
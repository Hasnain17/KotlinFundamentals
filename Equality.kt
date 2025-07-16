data class Person(val name: String, val age: Int)

fun main() {
    // Creating two instances with the same content
    val person1 = Person("Hasnain", 30)
    val person2 = Person("Hasnain", 30)

    // Referential Equality
    println("Referential Equality:")
    println("person1 === person1: ${person1 === person1}")  // true - same reference
    println("person1 === person2: ${person1 === person2}")  // false - different references

    // Structural Equality
    println("\nStructural Equality:")
    println("person1 == person1: ${person1 == person1}")    // true - same content
    println("person1 == person2: ${person1 == person2}")    // true - same content

    // Modifying one instance
    val modifiedPerson = person1.copy(name = "Hasnain",age = 10)

    // Structural Equality after modification
    println("\nStructural Equality after Modification:")
    println("person1 == modifiedPerson: ${person2 == modifiedPerson}")  // false - different content
}

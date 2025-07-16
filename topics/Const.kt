package topics

object Const {
//  val name="Hasnain"
 const val name="Hasnain"
}

fun main(){
println(Const.name)
}

/**
 * What is the advantage of const in kotlin.
 * In Kotlin, the const keyword is used to declare compile-time constants.
 * It has several advantages, particularly when you need values that are immutable, known at compile time,
 * and can be inlined by the compiler for better performance.
 *
 *
 * ------------
 * In the above example, the value has been inlined, there will be no overhead to access that variable at runtime.
 * And hence, it will lead to better performance of the application.
 * */
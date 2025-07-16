package topics

data class User(val name: String)

class ReifiedKeyword {
//    fun <T> checkType(value: Any): Boolean {
//        return value is T  // ❌ Error: Cannot check for erased type
//    }

    inline fun <reified T> checkType(value: Any): Boolean {
        return value is T  // ❌ Error: Cannot check for erased type
    }


    inline fun <reified T> printTypeName(value: Any) {
        if (value is T) {
            println("Value is of type ${T::class.simpleName}")
        } else {
            println("Not of type ${T::class.simpleName}")
        }
    }

}

fun main(){
    val instance=ReifiedKeyword()
    instance.printTypeName<String>("Hasnain")
    instance.printTypeName<Int>("Hasnain")
}

/**
 * In Kotlin, the reified keyword is used in combination with inline functions to preserve generic type information at runtime,
 * which is normally erased due to type erasure on the JVM.
 *
 *
 * reified only works in inline functions.
 *
 * You cannot use reified in abstract classes or interfaces, because inline functions can't be abstract.
 *
 * Too much inlining can lead to code bloat if misused.


 *
 * */
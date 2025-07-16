package topics

class InLineFunctions {
    fun guide(){
        println("guide start")
        teach()
        println("guide end")
    }

    private inline fun teach(){
        println("teach")
    }
}

fun main(){
    val instance=InLineFunctions()
    instance.guide()
}


/**
 * What is Inline Function in kotlin?
 * Inline function instruct compiler to insert the complete body of the function wherever that
 * functions gets used in the code.
 *
 * With inline keyword the complete block of code from the teach function will be copied from teach to guide function and guide function
 * will no more calling the teach function. This is because, We use the inline keyword.
 *
 * Advantage: Function call overhead doesn't occur. Less overhead and faster program execution.
 *
 * --------------------------------------------------------------
 * When to make function inline and when not:
 *
 * When the function code is very small, it's a good idea to make the function inline.
 *
 * When the function code is large and called from so many places, its bad idea to make the function inline as large code will be again and again.
 *
 */
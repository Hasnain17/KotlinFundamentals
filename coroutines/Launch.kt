package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    /*
    * launch is used to fire and forget coroutine. It's perfect for cases where you don't need to compute any result.
    * Here's a simple example:
    * */

    GlobalScope.launch {
        delay(1000L)
        println("Hello from Coroutine!")
    }
    println("Hello from Main Thread!")
    Thread.sleep(2000L)
}
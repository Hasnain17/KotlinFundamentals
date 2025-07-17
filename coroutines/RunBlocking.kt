package kotlinFundamentals.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    launch {
        delay(1000L)
        println("Hello from Coroutines!")
    }
    println("Hello from the Main Thread!")
}
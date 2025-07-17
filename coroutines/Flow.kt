package kotlinFundamentals.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


/*
* Flow is a type in Kotlin that can emit multiple values sequentially,
*  as opposed to suspend functions which return only a single value.
* It’s a cold stream, meaning the code inside a flow builder does not run until the flow is collected.
* Here’s a simple example:
* */

fun numbers(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000L)
        emit(i)
    }
}

fun main() = runBlocking {
    launch {
        for (k in 1..5) {
            println("I'm not blocked $k")
            delay(1000L)
        }
    }
    numbers().collect { value -> println(value) }
}
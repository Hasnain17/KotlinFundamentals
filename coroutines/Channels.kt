package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


/*
* Channels in Kotlin Coroutines provide a way to transfer a stream of values between coroutines.
* They are similar to BlockingQueue, but with some key differences.
* For example, instead of putting an element to a queue, a sender sends it to a channel.
* Instead of taking an element from a queue, a receiver receives it from a channel.
* */

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close()
    }
    repeat(5) { println(channel.receive()) }
    println("Done!")
}
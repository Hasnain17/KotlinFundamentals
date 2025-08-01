package kotlinFundamentals.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch {
        val result=async {
            println(computeResult())
        }
        println("Computed result: ${result.await()}")
    }
    Thread.sleep(2000L)

}

suspend fun computeResult(): Int {
    delay(1000L)
    return 42
}

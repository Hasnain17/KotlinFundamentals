package kotlinFundamentals.coroutines
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class CombiningMultipleCoroutines {

    suspend fun performRequest(request: Int): String {
        delay(1000L)
        return "response $request"
    }

    fun main() = runBlocking {
        val nums = (1..5).asFlow()
        val strs = nums.map { performRequest(it) }
        nums.zip(strs) { a, b -> "$a -> $b" }
            .collect { println(it) }
    }


}
import kotlinx.coroutines.*

fun main()  {
/*    GlobalScope.launch(Dispatchers.IO) {
        println("IO: ${Thread.currentThread().name}")
    }*/


   /* GlobalScope.launch(Dispatchers.Default) {
        println("Default: ${Thread.currentThread().name}")
    }*/


/*    GlobalScope.launch(Dispatchers.Main) {
        println("Main: ${Thread.currentThread().name}")
    }*/


    GlobalScope.launch (Dispatchers.Unconfined){
        println("Unconfined: ${Thread.currentThread().name}")

    }
}
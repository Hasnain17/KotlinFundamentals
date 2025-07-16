fun main(){
    //Let
    val result = "Hello"
    val length = result.let {
        println("Let (example)-> Length of the string: ${it.length}")
        it.length
    }
    println(length)

    //run
    val num = run {
        val a = 10
        val b = 20
        a + b
    }
    println(num)



}
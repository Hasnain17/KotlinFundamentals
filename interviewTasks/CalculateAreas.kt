package kotlinFundamentals.interviewTasks

    // To calculate the area of a circle and a square from a list of side lengths in Kotlin, you can iterate over the list and compute
    fun main(){

        val sides= listOf(2.0, 3.5 ,6.5)

        println("Area of Circle")

        sides.forEach{radius->
            val circleArea=Math.PI * radius * radius
            println("Radius: $radius->  Area:  %.2f".format(circleArea))
        }

        println("\nArea of Squares")

        sides.forEach{ side->
            val squareArea=side * side
            println("Side: $side -> Area: %.2f".format(squareArea))
        }
    }


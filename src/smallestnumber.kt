import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    println("Enter first number :")
    var first = input.nextInt()

    println("Enter second number :")
    var second = input.nextInt()

    println("Enter third number")
    var third = input.nextInt()

    if (first < second && first < third){
        println("$first is the smallest ")

    }
    else if (second < first && second < third ){
        println("$second is the smallest number")
    }
    else {
        println("$third is the smallest number")
    }

}
fun main() {

    //While loop
    var number = 200
    while (number<=205){
        println(number)
        number++
    }

    var num = 100
    while (num>=95){
        println("number is $num")
        num--
    }

    //Do..while loop
    var num1 = 20
    do {
        println(num1)
        num1++
    }while (num1 <= 25)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(15,27,71,30,54)
    for (n in  marks){
        println("Maths marks is $n")
    }

    for (number in 30 ..35){
        println(number)
    }
    for (char in 'a'..'b'){
        println(char)

    }

}
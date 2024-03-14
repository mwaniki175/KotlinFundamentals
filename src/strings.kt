fun main() {
    var greeting  = "Hello World"
    var firstname  = "Alexander"
    var lastname = "Njiru"

    //string concatenation
    println(firstname +" "+lastname)
    println(firstname.plus(lastname))

    //Accessin an element in a string

    println(greeting[6])

    //Determine an index position

    println(greeting.indexOf("World"))
    println(greeting.indexOf('o'))

    //modifying a string

    println(greeting.uppercase())

    //String interpolation

    println("Hello there, my name is $firstname $lastname")

    //Size of a string

    println(greeting.length)


}
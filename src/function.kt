fun main() {

    //Predefined Fuctions

    println("Hello Kotlin")

    var x = Math.min(45,84)
    println(x)

    var y = Math.max(90,124)
    println(y)

    var z = Math.round(45.98)
    println(z)
    name()
    product(12,23)
    details("Joe",45)
}
//This is a user defined function
fun name(){
    println("Alexander")
}
fun product(num1:Int, num2:Int){
    println(num1 * num2)
}
fun details(name:String,age:Int){
    println("$name is $age years old")
}

class dog(var name:String,var breed:String,var age:Int ){
    fun move(movement:String){
        println("The dog is $movement")

    }

}
fun main(){
    var dog1 = dog("Bob","Bulldog",6)
    var dog2 = dog("Tracey","Chiwawa",5)

    println(dog1.breed)
    println(dog1.name)

    dog1.move("Walking")
    dog2.move("Walking")
}
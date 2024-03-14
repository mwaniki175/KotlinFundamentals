import java.security.KeyStore.TrustedCertificateEntry

//Parent class/super class/Base class
open class animal{
    var age = 2
    var gender  = "Female"

    fun move(movement:String){
        println("Animal is $movement")
    }

}
//Child class/sub class/Derived class
class Duck:animal(){
    var color = "White"
    fun sound(){
        println("Duck is quacking")
    }
}
class Fish{
    var hasScales  = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }
}
fun main(){
    var a = animal()

    var d = Duck()


    var nileperch = Fish()
}
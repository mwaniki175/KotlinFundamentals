//Parent class
open class Shape{
    open fun draw(){
        println("Drawing a shape")

    }
}
//Child class
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a Rhombus")
    }
}
class parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main(){
    var s = Shape()
    var r = Rhombus()
    var p = parallelogram()
}
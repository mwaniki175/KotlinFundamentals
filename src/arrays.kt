fun main() {
    var languages = arrayOf("Kotlin","Javascript","Pyhon","C++")

    println(languages[1])

    //Reassigning a value

    languages[1] = "PHP"
    println(languages[1])

    //Looping through an  array
    for (lang in languages){
        println(lang)
    }
    //Determining whether ana element exists
    if ("PHP" in languages){
        println("It exists")
    }
    else{
        println("It does mot exists")
    }

}
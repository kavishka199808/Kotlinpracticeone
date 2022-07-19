fun main2() {
    purpleCow()
    moo()
    purpleCow()
    purpleCow()
    purpleCow()
}
fun purpleCow(){
    println("Hello purple cow")
    println("Hello Blue Cow")
}

fun moo(){
    println("Moo!")
    println("Moo Moo Buckaroo!")
}


//---------------------------------------
fun main3(){
    var x = sayHi()
    println(x)

}
fun sayHi():String{
    return "Hello World"
}

//---------------------------------------
fun main4(){
    var y =sayHii()
    println(y)

}
fun sayHii():Int{
    return 32
}

//---------------------------------------
fun main5(){
    var y =sayHiii()
    println(y)

}
fun sayHiii():String{
    return 32.toString()
}


//---------------------------------------
fun main6(){
   sayHiAndBy()

}
fun sayHiAndBy(){
    println("Hello")

    fun sayBye(){
        println("Bye")

        fun moo(){
            println("moo")
        }
        moo()
    }
    sayBye()
}


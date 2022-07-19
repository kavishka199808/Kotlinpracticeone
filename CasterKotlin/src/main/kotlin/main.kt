fun main() {

   // ---------------------------------
    println("Hello World")

    // ---------------------------------

    var fullName = "Kavishka Dislshan"
    println(fullName)

    fullName = "Tharidu buddika"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty())

    var age = 30
    age = 32
    println(age)

    // ---------------------------------

    val fulName = "Kavishka Dilshan"
    println(fullName)

    val agee = 32
    println(agee)


    // ---------------------------------

    val fullyName = "Kavishka Dilshan"
    println(fullyName::class)

    var Name:String = "Kavishka Dilshan"
    var num1:Int = 32

    val myBite:Byte = 8 // 8-bit signed integer
    val myShort:Short = 16 // 16bit
    val myInt : Int = 32 //32 bit
    val myLong :Long = 64 //64 bit

    val myFloat:Float = 32.00F// 32bit floating point number
    var myDouble:Double = 64.00 // 64-bit floting poin number

     println(myBite.toDouble()::class)

    val bigLong:Long = 1000_000_000
    println(bigLong)

    var newInt = myInt.times(12)
    println(newInt)



    // ---------------------------------

    var n1:String = "Hello World"
    println(n1.length)
    println(n1.toLowerCase())

    val first = "Kavi"   //single  quote :char
    val c:Char = 'x'       //Double quote :String

    // ---------------------------------

    var message:String  = "Hello,\n My name is kavishka.\n How are you?"
    println(message)

    var message2:String = """
        Hello,
        my name is Kavishka Dilshan
        How are you?
    """.trimIndent()
    println(message2)

    var message3:String = """
        Hello,
        my name is Kavishka Dilshan
        How are you?
    """.replaceIndent("abc-|-")
    println(message3)

    var t1 = "kavishka"
    println("Hello "+t1)

    var t2 = 23
    println("Hello $t1,your age is $t2 and your name is ${t1.length} characters long. ")

    // ---------------------------------

    var isBlank: Boolean = false
    println(isBlank)

    println(isBlank.not())

    isBlank = "".isBlank()

    println(isBlank)


    isBlank = "kavishka".isBlank()
    println(isBlank)


    // ---------------------------------

    var calories = 1400
    if (calories>2000){
        println("you've consumed all your calories for the day")
    }else if (calories>1200){
        println("You have some room for snacks")
    }else{
        println("You still have some calories left!")
    }


    val a = 9
    if (a>10)
        println("Tha age is greater than 10")
        println("Hello there")


    val b = 11
    if (b>10) println("Tha age is greater than 10")
    println("Hello there")


    // ---------------------------------

    val myAge = 32
    val yourAge = 32

    val myName = "Donn"
    val yourthName = "Tushar"

    if( (myAge != yourAge) && (myName != yourthName) ){
           println("Both items are True")
    }else{
        println("Both items are False")
    }

    val my1 = 32
    val your1 = 32

    val myN2 = "Donn"
    val yourN2 = "Tushar"

    if( (my1 != your1) || (myN2 != yourN2) || (myAge == myName.length)){
        println("Both items are True")
    }else{
        println("Both items are False")
    }









}
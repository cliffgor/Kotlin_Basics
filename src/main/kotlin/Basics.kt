// This is how we create a function and the function we created is called
// Main that is the starting point of the application

fun main() {
// Here we created a var that stores the topic and print as Hello + topic
// Difference between var and val
//    Var can be reassigned a new value(Mutable)
//    val can only be assigned once and the value can not be overwritten (Immutable)
    //var topic = "We are Learning Kotlin Basics"
    val topic = "We are Learning Kotlin Basics"

//    types string
    val myName = "Frank"

//    type int 32 bit
    var myAge = 31

//Integer TYPES: Byte (8bit), Short(26 bit), Int(32 bit), Long(64 bit)

    val myByte: Byte = 12
    val myShot: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

//    The print("") method is a code blog that tells our IDEA to display something
//    Here we add the variable to the Print Statement
    print("Hello " + topic)
}
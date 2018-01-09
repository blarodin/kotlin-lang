/*
Numbers in Kotlin are similar to Java.
There are 6 built-in types representing numbers.

- Byte (from -128 to 127 (8-bit signed two's complement integer))
- Short (from -32768 to 32767 (16-bit signed two's complement integer))
- Int (from -2^31 to 2^31-1 (32-bit signed two's complement integer))
- Long (from -2^63 to 2^63-1 (64-bit signed two's complement integer))

- Float (is a single-precision 32-bit floating point))
- Double (is a double-precision 64-bit floating point))

To represent a character in Kotlin, Char types are used.
Char types cannot be treated as numbers.

Boolean data type has two possible values, either true or false.
*/

fun main(args : Array<String>) {
    // Byte
    val range: Byte = 113
    println("$range")

    // The code below gives error. Why?
    // val range1: Byte = 200

    // Short
    val temperature: Short = -11245
    println("$temperature")
    /////////////////////////////////////

    // Int
    val score: Int =  100000
    println("$score")

    // score is of type Int
    val score = 10
    println("$score")
    /////////////////////////////////////

    // Long
    val highestScore: Long = 9999
    println("$highestScore")

    // distance variable of type Long
    val distance = 10000000000  

    // distance value of type Long
    val distance = 100L
    /////////////////////////////////////

    // Double
    val distance = 999.5
    println("$distance")
    /////////////////////////////////////

    // Float
    // distance is of type Float
    val distance = 19.5F
    println("$distance")
    /////////////////////////////////////

    // Smart cast from Number
    var test: Number = 12.2
    println("$test")

    test = 12
    // Int smart cast from Number
    println("$test")

    test = 120L
    // Long smart cast from Number
    println("$test")
    /////////////////////////////////////

    // Char
    val letter: Char
    letter = 'k'
    println("$letter")

    // Boolean
    val flag = true
    println("$flag")
}
package introduction

import java.util.Scanner

// Here we have basic Kotlin challenges that are beginner-friendly

fun main() {

    // KOTLIN PROGRAM THAT PRINTS AN INTEGER INPUT BY THE USER
    // reader instance that takes input from the standard input keyboard
    val reader = Scanner(System.`in`)
    println("Enter a number: ")
    // nextInt() reads the next integer from the keyboard
    val integer = reader.nextInt()
    println("You entered: $integer")



    // KOTLIN PROGRAM TO ADD TWO INTEGERS
    val a: Int = 20
    val b: Int = 30
    val add: Int = a + b
    println("The sum is: $add")


    // KOTLIN PROGRAM TO MULTIPLY TWO FLOAT NUMBERS
    val x: Float = 7.3f
    val y: Float = 2.7f
    val multiply: Float = x * y
    println("The product is: $multiply")

    // KOTLIN PROGRAM TO OUTPUT THE ASCII VALUE OF A CHARACTER
    val w = 'h'
    val ascii = w.toInt()
    println("ASCII value of $w is: $ascii")

}
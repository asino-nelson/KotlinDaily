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



}
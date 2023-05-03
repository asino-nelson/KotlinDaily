package loops

import java.util.Scanner

fun main() {

    // CHECK LEAP YEAR
    val reader = Scanner(System.`in`)
    print("Enter year: ")
    val year = reader.nextInt()
    if (year%4 == 0) {
        println("The year $year is a leap year")
    } else {
        println("The year $year is not a leap year")
    }




    // KOTLIN PROGRAM TO FIND THE LARGEST OF THREE NUMBERS
    val firstNumber = 20
    val secondNumber = 10
    val thirdNumber = 30

    if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
        println("$firstNumber is the largest")
    }else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)){
        println("$secondNumber is the largest")
    }else{
        println("$thirdNumber is the largest")
    }




    // KOTLIN PROGRAM TO CHECK WHETHER A NUMBER IS POSITIVE OR NEGATIVE

    val input = 9

    if (input > 0) {
        println("$input is positive")
    } else if (input < 0) {
        println("$input is negative")
    }else{
        println("The number is 0")
    }




}
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




    // KOTLIN PROGRAM TO FIND THE SUM OF POSITIVE NUMBERS
    val number = 100
    var sum = 0
    for (num in 0..100){
        sum += num
    }
    println(sum)





    // KOTLIN PROGRAM TO GENERATE MULTIPLICATION TABLE
    println("----*----")
    val numbers = listOf(1,2,3,4,5)
    val product = numbers.forEach {
        for (i in 1..5){
            val multiply = it*i
            println( "$it * $i = $multiply")
        }
        println("----*----")
    }





    // KOTLIN PROGRAM TO GENERATE THE FACTORIAL OF A NUMBER
    val long: Unit = println(Long.MAX_VALUE)
    val scanner = Scanner(System.`in`)
    print("Enter a number to generate its factorial: ")
    val inputNum = scanner.nextInt()

    var factorial:Long = 1
    for (i in 1..inputNum) {
        factorial *= i
    }
    println("$inputNum ! is $factorial")













}
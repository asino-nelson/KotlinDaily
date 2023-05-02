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

}
package collections

fun main(){
    // KOTLIN PROGRAM TO JOIN TWO LISTS

    val utensils = ArrayList<String>()
    utensils.add("Plate")
    utensils.add("Cup")

    val stationery = ArrayList<String>()
    stationery.add("Book")
    stationery.add("Pencil")

    val joined = ArrayList<String>()

    joined.addAll(utensils)
    joined.addAll(stationery)

    println("Utensils: $utensils")
    println("Stationery: $stationery")
    println("Joined: $joined")
}
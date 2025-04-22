package com.example.myapplication

fun main() {
    displayList()
}

fun displayList() {
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Immutable list:")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("four")
    println("Mutable list:")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }

    // Set example
    val numbersSet = setOf(1, 2, 3, 4)
    println("\nSet elements:")
    for (element in numbersSet) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbersSet == numbersBackwards}")

    // Map example
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("\nAll Keys: ${countriesCapitals.keys}")
    println("All Values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
}

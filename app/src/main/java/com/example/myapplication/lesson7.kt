package com.example.myapplication

import kotlin.random.Random

fun main() {

    print("Please enter a number: ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }

    print("Please enter your age: ")
    val yourAge = readln().toInt()
    if (yourAge < 13) {
        println("You are a teenager")
    } else {
        if (yourAge < 50) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    }

    println("Please enter 3 numbers: ")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()  // corrected from number4

    val largestNumber = if (number1 >= number2) {
        if (number1 >= number3) number1 else number3
    } else {
        if (number2 >= number3) number2 else number3
    }
    println("The largest number is $largestNumber")

    print("Please enter a day number of the week: ")
    val dayNumber = readln().toInt()
    val day = when (dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }
    println(day)

    println("Printing numbers from 1 to 9:")
    for (i in 1..9) {
        println(i)
    }

    var sum = 0
    for (x in 0..5) {
        println(x)
        sum += x
    }

    sum = 0 // Reset before next loop
    println("Even numbers and their sum from 0 to 10:")
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x
        }
    }
    println("The sum of even numbers is $sum")

    val vehicleList = arrayListOf("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicleList.indices) {
        println("The value at index $y is: ${vehicleList[y]}")
    }

    val vehicles = arrayListOf("Tata", "Kia", "Hyundai", "MG")
    vehicles.forEach {
        println(it)
    }

    var i = 0
    println("While loop from 0 to 4:")
    while (i < 5) {
        println(i)
        i++
    }

    // Factorial calculation using while loop
    var k = 1
    var fact = 1
    println("Factorials from 1! to 5!:")
    while (k < 6) {
        fact *= k // Corrected the factorial logic
        println("$k! = $fact")
        k++
    }

    val secretNumber = Random.nextInt(0, 10000)
    println("Guessing game: Please enter a number from 0 to 10000")
    while (true) {
        val userGuess = readln().toInt()
        if (userGuess == secretNumber) {
            println("Congratulations!!!! You won!")
            break
        } else if (userGuess < secretNumber) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }

    var numberLoop = 1
    println("Do-while loop from 1 to 15:")
    do {
        println(numberLoop)
        numberLoop++
    } while (numberLoop <= 15)
}

package com.example.myapplication

fun main() {

    fun show(a: Int, b: Int) {
        println("You entered $a and $b")
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun findMinimumNumber(a: Int, b: Int): Int {
        return if (a < b) a else b
    }

    println("Enter first number: ")
    val a: Int = readln().toInt()
    println("Enter second number: ")
    val b: Int = readln().toInt()

    show(a, b)

    val sum = add(a, b)
    println("Sum of the two entered numbers is $sum")

    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}

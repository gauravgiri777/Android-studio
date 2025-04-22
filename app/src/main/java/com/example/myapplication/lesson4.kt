package com.example.myapplication

fun main(args: Array<String>) {
    // Array of integers
    val age = arrayOf(1, 2, 3)
    println(age.contentToString())
    println("The first element of the age is " + age[0])
    println("The second element of the age is " + age[1])
    println("The third element of the age is " + age[2])
    println("********************************")

    // Array of strings
    val nameArray = arrayOf("ram", "shyam", "Hari")
    nameArray[1] = "sandis"
    println("The first element of name is " + nameArray[0])
    println("The second element of name is " + nameArray[1])
    println("The third element of name is " + nameArray[2])
    println("Size of nameArray: ${nameArray.size}")

    // ArrayList of integers
    val age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20) // index = 1, element = 20
    age1.add(5)
    println("age1: $age1")

    // ArrayList of strings
    val nameList = arrayListOf("sandis", "ram", "shyam")
    nameList.add("hari")
    nameList.add(4, "Sita")
    nameList.remove("shyam")
    nameList.removeAt(0)
    println("nameList: $nameList")

    // Mixed type ArrayList
    val mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}

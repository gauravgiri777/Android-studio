package com.example.myapplication

fun main(){
//    println("hello world")

    //mutable variable
    var firstName = "sandis"
    var lastName = "prajapti"

    println(firstName + " "  + lastName)

    println("${firstName.length} $lastName")

    // String name = "sandis"

    var name : String = "sandis"

    val age : Int = 10

    //var address = arrayListOf("Ktm","Pokhara","Bhaktapur")
    // address[3] = "sasa"
    // println(address[3])

    var data = ArrayList<Any>()

    data.add(1)
    data.add(2)
    data.add("rams")

    var address = arrayListOf("Ktm", "chitwan")
    address.add("pokhara")

    var dictonary = mapOf(
        "Apple" to "This is fruit",
        "Samsung" to "This is brand"
    )

    println("The value of Apple is ${dictonary["Ram"]}")

    //immutable variable
    }

//C:\Users\Asus\AndroidStudioProjects\MyApplication\app\src\main\java\com\example\myapplication\week 11.kt
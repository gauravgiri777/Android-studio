package com.example.myapplication

fun main() {




    print("Hello world");


// mutable
// we can re assign values to mutable variable
var age = 20;

age = 25

// immutable
// we can't re assign values to immutable variables
val roll = 15

//roll = 10


//    var a : Boolean = true
//    var b : Char = 'R'
//    var c : Byte = 12
//    var d : Short = -356
//    var e : Int = 43543
//    var f : Long = -51321354L
//    var i : Float = 5.6451344F
//    var h : Double = 7.32644564
//
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(e)
//    println(f)
//    println(i)
//    println(h)

//    var x: Double = 132.32
//    var y: Int = x.toInt()
//    var z: Byte = y.toByte()
//
//    println(x)
//    println(y)
//    println(z)

    var a: String = "Hello world"
    var i: Int = a.length
    var x: Boolean = a.equals("Hello world")
    var username: String = " softwarica "

    println(username.trim())
    println(a);
    println(i)
    println(a.isEmpty())
    println(a.lowercase())
    println(a.uppercase())
    println(x)
    print(a.plus( ", How are you?"));


}


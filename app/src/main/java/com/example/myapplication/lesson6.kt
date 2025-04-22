package com.example.myapplication

fun main() {

    var num1: Double = 10.6
    var num2: Double = 5.0
    var resultDouble: Double

    resultDouble = num1 + num2
    println("num1 + num2 is $resultDouble")
    resultDouble = num1 - num2
    println("num1 - num2 is $resultDouble")
    resultDouble = num1 * num2
    println("num1 * num2 is $resultDouble")
    resultDouble = num1 / num2
    println("num1 / num2 is $resultDouble")
    resultDouble = num1 % num2
    println("num1 % num2 is $resultDouble")

    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *= x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")

    var number: Double = 7.6
    var isCheck: Boolean = true
    println("+number = ${+number}")
    println("-number = ${-number}") // fixed
    println("++number = ${number + 1}") // ++ doesn't work this way in Kotlin
    println("--number = ${number - 1}") // -- doesn't work this way either
    println("!isCheck = ${!isCheck}") // applied to Boolean only
    println("----------------------------")

    var result = 4.7
    println("result :$result")
    println("result++ : ${result++}") // valid usage of post-increment

    var a: Int = 5
    var b: Int = 5

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a < b : ${a < b}")
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a <= b : ${a <= b}")

    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var conditionResult: Boolean
    conditionResult = (number1 > number2) || (number3 > number2)
    println("Logical OR result: $conditionResult")

    // BODMAS
    var mathResult: Int = 5 + 2 * 4
    println("Result = $mathResult")
    mathResult = (5 + 2) * 4
    println("Result = $mathResult")

    x = 8
    y = 4
    z = 2
    var sum: Int
    y--
    z--
    sum = x + y + z
    println("x + --y + --z ::: $sum")

    val myCharRange = 'a'.rangeTo('j')
    val testCharRange = 'a'..'j'

    val check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println("myCharRange: $myCharRange")
    println("testCharRange: $testCharRange")

    print("Enter name:: ")
    val name: String? = readln()

    print("Enter age:: ")
    val age: Int = readln().toInt()

    println("Name: $name, Age: $age")
}

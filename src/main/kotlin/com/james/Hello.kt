package com.james

fun main(args: Array<String>) {
//    println("Hello World");
//    Human().hello();
    val h = Human();
    h.hello();
}

class Human{
    fun hello(){
        print("Hello kotlin")
    }
}
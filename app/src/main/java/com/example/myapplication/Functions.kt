package com.example.myapplication

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// Named argument
// Cara memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}
//cara mendeklarasikan dan memanggil fungsi dengan atau tanpa parameter, serta menggunakan named arguments

// Default parameter value
// Cara memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

// Fungsi dengan return value
fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}
// membuat fungsi return value dan memberikan nilai pada nilai fungsi default pada parameter

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)

    val result = withReturn(5, 3)
    println("Hasil perkalian: $result")
}
//memanggil berbagai fungsi di Kotlin, termasuk fungsi tanpa parameter, dengan parameter, dengan named arguments, parameter default, dan fungsi yang mengembalikan nilai
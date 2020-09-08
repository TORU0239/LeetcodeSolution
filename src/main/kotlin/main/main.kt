package main

import stack.isValid
import stack.reverseInteger
import stringmanipulation.reverseString2

fun main(args: Array<String>) {
    reverseString2(charArrayOf('h','e', 'l', 'l', 'o'))
    reverseString2(charArrayOf('H','a', 'n', 'n', 'a', 'h'))

    println("stack.isValid: ${isValid("()[]{}")}")
    println("reversed: ${reverseInteger(349)}")
}
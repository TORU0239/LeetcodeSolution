package main

import array.*
import stack.isValid
import stack.reverseInteger
import stringmanipulation.reverseString2
import stringmanipulation.twoSum2

fun main(args: Array<String>) {
    reverseString2(charArrayOf('h','e', 'l', 'l', 'o'))
    reverseString2(charArrayOf('H','a', 'n', 'n', 'a', 'h'))

    println("stack.isValid: ${isValid("()[]{}")}")
    println("reversed: ${reverseInteger(349)}")

    println("result: ${twoSum(intArrayOf(2,3,4), 6)}")

    threeSumWithValue(intArrayOf(2,4,5,0,3,1), 10)

    isPairSum(intArrayOf(10,20,35,50,60,75,80), 70)
    isPairSum(intArrayOf(10,20,35,50,60,75,80), 80)
    isPairSum(intArrayOf(10,20,35,50,60,75,80), 90)

    printClosest(intArrayOf(1,4,5,7), intArrayOf(10,20,30,40), 38)

    closest(intArrayOf(10,22,28,29,30,40), 54)

    findTriplet(intArrayOf(5,32,1,7,10,50,19,21,2))
}
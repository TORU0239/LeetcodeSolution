package main

import Fibonacci
import array.*
import fibonacciRecur
import stack.*

import stringmanipulation.isPalindromeWithTwoPointer
import stringmanipulation.longestCommonPrefix
import stringmanipulation.reverseString2

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

    println("palindrome: ${isPalindromeWithTwoPointer("madam")}")
    println("palindrome: ${isPalindromeWithTwoPointer("madan")}")
    println("palindrome: ${isPalindromeWithTwoPointer("kanak")}")

    gauss(intArrayOf(1,2,3,4,5,6,7,8,9,10))


//    val queue = QueueUsingStack()
//    queue.push(1)
//    queue.push(2)
//    queue.push(3)
//
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.pop())

//    val stack = StackUsingQueue()
//    stack.push(1)
//    stack.push(2)
//    stack.push(3)
//
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())

//    val queue = TwoStackForQueue()
//    queue.push(1)
//    queue.push(2)
//    queue.push(3)
//    queue.push(4)
//    queue.push(5)
//
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.pop())
//
//    val stack = TwoQueueForStack()
//    stack.push(1)
//    stack.push(2)
//    stack.push(3)
//    stack.push(4)
//    stack.push(5)
//
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())

//    longestCommonPrefix(arrayOf("google", "googol", "goose", "geese", "gogogo"))

    val fibo = Fibonacci()
    println(fibo.fibonacciMemoization(3))
    println(fibo.fibonacciMemoization(5))
    println(fibo.fibonacciMemoization(7))
    println(fibo.fibonacciMemoization(10))
    println(fibo.fibonacciMemoization(11))
    println(fibo.fibonacciMemoization(12))
    println(fibo.fibonacciMemoization(20))




}
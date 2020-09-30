package array

import kotlin.math.abs

/*
*
*
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]

Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]
* */

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var leftIndex = 0
    var rightIndex = numbers.size - 1

    while(leftIndex < rightIndex) {
        if(numbers[leftIndex] + numbers[rightIndex] == target){
            println("leftindex: ${leftIndex+1}, rightIndex: ${rightIndex+1}")
            return intArrayOf(leftIndex+1, rightIndex+1)
        } else {
            if (numbers[leftIndex] + numbers[rightIndex] > target) {
                rightIndex--
            } else {
                leftIndex++
            }
        }
    }

    return intArrayOf(leftIndex+1, rightIndex+1)
}


fun removeElement(nums: IntArray, value: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left < right) {
        if (nums[left] == value) {
            nums[left] = nums[right]
            right--
        } else {
            left++
        }
    }

    return right
}

fun isPairSum(arr:IntArray, value:Int) {
    var left = 0
    var right = arr.size - 1

    var caseCount = 0
    while (left < right) {
        val sum = arr[left] + arr[right]

        when {
            sum == value -> {
                println("first: ${arr[left]}, second: ${arr[right]}")
                caseCount++
                left++
                right--
            }
            sum > value -> {
                right--
            }
            else -> {
                left++
            }
        }
    }

    println("case count: $caseCount !!")
}

// Find the closest pair from two sorted arrays
fun printClosest(arr1:IntArray, arr2:IntArray, value:Int) {
    var diff = Integer.MAX_VALUE
    var left = 0
    var right = arr2.size - 1

    while(left < arr1.size && right >= 0) {
        val absDiff = abs(arr1[left] + arr2[right] - value)
        println("abs Diff: $absDiff")
        if (absDiff < diff) {
            diff = absDiff
            println("value: left: ${arr1[left]}, right: ${arr2[right]}")
        }

        if (arr1[left] + arr2[right] > value) right--
        else left++
    }
}

// Given a sorted array and a number x, find the pair in array whose sum is closest to x

fun closest(arr1:IntArray, x:Int) {
    var left = 0
    var right = arr1.size - 1

    var givenDiff = Integer.MAX_VALUE

    var leftValue = 0
    var rightValue = 0
    while (left < right) {
        val diff = abs(arr1[left] + arr1[right] - x)
        if (diff < givenDiff) {
            givenDiff = diff
            leftValue = arr1[left]
            rightValue = arr1[right]
        }

        if (arr1[left] + arr1[right] > x) right--
        else left++
    }

    println("value L : $leftValue, value R : $rightValue")
}

// find the triplet that sum to a given value.

fun findTriplet(arr:IntArray) {
    arr.sort()

    for (i in arr.indices) {
        var left = 0
        var right = i - 1
        while (left < right) {
            if (arr[i] == arr[left] + arr[right]) {
                println("arr Left: ${arr[left]}, arr Right: ${arr[right]}, sum: ${arr[i]}")
                break
            } else if (arr[i] > arr[left] + arr[right]) {
                left++
            } else {
                right--
            }
        }
    }
}

fun gauss(arr:IntArray){
    var sum = 0
    var left = 0
    var right = arr.size - 1

    var calTime = 0
    while (left < right) {
        println("cal time: ${++calTime}")
        sum += (arr[left] + arr[right])
        left++
        right--
    }

    println("sum: $sum")
}
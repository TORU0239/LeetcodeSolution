package array

// LEETCODE ARRAY
// ARRAY PARTIION - 561

fun arrayPairSum(nums: IntArray): Int {
    var sum = 0
    nums.sort()
    // 1,2,3,4
    for (i in nums.indices) {
        if (i % 2 == 0) {
            sum += nums[i]
        }
    }
    return sum
}
package stringmanipulation

// LEETCODE ARRAY
// PRODUCT OF ARRAY EXCEPT SELF - 238
// WRONG ANSWER
fun productExceptSelf(nums: IntArray): IntArray {
    // [1,2,3,4]
    // [24, 12, 8, 6]
    // O(n)

    var result = arrayListOf<Int>()

    var leftproduct = 1
    var leftResult = arrayListOf<Int>()

    var rightproduct = 1
    var rightResult = arrayListOf<Int>()

    // left
    for (i in nums.indices) {
        // 0 -> num[1],num[2[,3
        // 1 -> 0,2,3
        // 2 -> 0,1,3
        // 3 -> 0,1,2
        if (i > 0) {
            leftproduct *= nums[i-1]
        }
        leftResult.add(leftproduct)
    }

    // right
    for (i in (nums.size -1) until 0) {
        if (i < nums.size -1) {
            rightproduct *= nums[i]
        }
        leftResult[i] *= rightproduct
    }

    return leftResult.toIntArray()
}
package array

// LEETCODE ARRAY
// 3 sum
// with given array, should return 3 elements able to make sum of it zero
fun three(nums:IntArray) {
    nums.sort()
    for (i in 0 until nums.size - 2) {
        if ( i > 0 && nums[i] == nums[i-1]) continue
        var low = i + 1
        var high = nums.size - 1

        while (low < high) {
            val sum = nums[i] + nums[low] + nums[high]
            when {
                sum < 0 -> {
                    low += 1
                }
                sum > 0 -> {
                    high -= 1
                }
                else -> {
                    println("[${nums[i]}, ${nums[low]}, ${nums[high]}]")
                    low += 1
                    high -= 1
                }
            }
        }
    }
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val set = HashSet<List<Int>>()
    if(nums.size <= 2) {
        return set.toList()
    }

    nums.sort()
    for(i in 0 until nums.size - 2) {
        var low = i + 1
        var high = nums.size - 1
        while (low < high) {
            val sum = nums[i] + nums[low] + nums[high]
            when {
                sum == 0 -> {
                    set.add(listOf(nums[i], nums[low], nums[high]))
                    low++
                    high--
                }
                sum < 0 -> low++
                else -> high--
            }
        }
    }
    return set.toList()
}


fun threeSumWithValue(nums:IntArray, value:Int):List<List<Int>> {
    val hashset = HashSet<List<Int>>()
    nums.sort()
    for (i in 0..nums.size - 2) {
        if(i > 0 && nums[i] == nums[i-1]) continue

        var low = i+1
        var high = nums.size - 1

        while (low < high) {
            val sum = nums[i] + nums[low] + nums[high]
            when {
                sum == value -> {
                    println("${nums[i]} / ${nums[low]} / ${nums[high]}")
                    hashset.add(listOf(nums[i], nums[low], nums[high]))
                    low++
                    high--
                }
                sum < value -> {
                    low++
                }
                else -> {
                    high--
                }
            }
        }
    }

    return hashset.toList()
}
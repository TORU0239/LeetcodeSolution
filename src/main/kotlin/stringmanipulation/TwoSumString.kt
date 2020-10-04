package stringmanipulation

//public int[] twoSum(int[] nums, int target) {
//    Map<Integer, Integer> map = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//        map.put(nums[i], i);
//    }
//    for (int i = 0; i < nums.length; i++) {
//        int complement = target - nums[i];
//        if (map.containsKey(complement) && map.get(complement) != i) {
//            return new int[] { i, map.get(complement) };
//        }
//    }
//    throw new IllegalArgumentException("No two sum solution");


// 2, 7, 11, 15, target = 9 / [0,1]
fun twosum(nums:IntArray, target:Int){
    val map = HashMap<Int,Int>()

    for (i in nums.indices) {
        map[nums[i]] = i
    }

    for (i in nums.indices) {
        val c = target - nums[i]
        // if c is included in the map, and index is not same.
        if (map.containsKey(c) && map[c] != i) {
            intArrayOf(i, map[c]!!)
        }
    }
}

fun twoSum(nums:IntArray, target:Int):IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        map[nums[i]] = i
    }

    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement) && map[complement] != i) {
            print("i: $i, value: ${map[complement]}")
            val arr = IntArray(2)
            arr[0] = i
            arr[1] = map[complement]!!

            return intArrayOf(i, map[complement]!!)
        }
    }
    throw IllegalArgumentException("")
}

fun twoSum2(nums:IntArray, target:Int) {
    for (i in nums.indices) {
        println("current index: $i")
        val rest = target - nums[i]
        val targetIndex = nums.indexOf(rest)
        if ( targetIndex != -1 && targetIndex != i) {
            println("target index: $targetIndex")
            // intArrayOf(i, targetIndex)
        }
    }
}
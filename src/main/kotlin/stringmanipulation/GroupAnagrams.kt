package stringmanipulation

// LEETCODE STRING MANIPULATION
// Anagram, 49

// ["eat", "tea", "tan", "ate", "nat", "bat"]
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String,ArrayList<String>>()
    for (str in strs) {
        val charArr = str.toCharArray()
        charArr.sort()
        val key = charArr.joinToString("")
        if (!map.containsKey(key)) {
            map[key] = ArrayList()
        }
        map[key]?.add(str)
    }
    return ArrayList(map.values)
}
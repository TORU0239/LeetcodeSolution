package stringmanipulation

// LEETCODE STRING MANIPULATION
// MOST COMMON WORD 819

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val paragraphList = paragraph.toLowerCase().split(Regex("\\W+|\\s+"))
    val countMap = HashMap<String, Int>()

    for (str in paragraphList) {
        if (!banned.contains(str)) {
            if (!countMap.containsKey(str)) {
                countMap[str] = 0
            }
            countMap[str] = (countMap[str]!! + 1)
        }
    }

    var freq = 0
    var result = ""
    countMap.keys.forEach {
        if (countMap[it]!! > freq) {
            freq = countMap[it]!!
            result = it
        }
    }
    return result
}
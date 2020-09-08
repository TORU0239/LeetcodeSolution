package stringmanipulation

// Reverse String //
fun reverseString(s: CharArray): Unit {
    println(s)
    for (i in 0 until s.size / 2) {
        val temp = s[i]
        s[i] = s[s.size - i -1]
        s[s.size - i - 1] = temp
    }
    println(s)
}

fun reverseString2(s:CharArray) {
    println(s)
    var left = 0
    var right = s.size - 1

    while (left < right) {
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    }
    println(s)
}
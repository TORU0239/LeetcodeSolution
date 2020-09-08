package stack

// 239 = 2* 100 + 3 * 10 + 9
fun reverseInteger(input:Int):Int {
    var integer = input
    var reversed = 0
    while (integer != 0) {
        val digit = integer % 10 // 9
        reversed = reversed * 10 + digit
        integer /= 10
    }

    return reversed
}

// reverse string using Stack
package stringmanipulation

// String Manipulation
// using reverse of string
fun isValidPalindrome(str:String):Boolean {
//    val charArr = str.toCharArray().filter {
//        it.isLetterOrDigit()
//    }.joinToString("").toLowerCase()


    val charArr = str.filter {
        it.isLetterOrDigit()
    }.map {
        it.toLowerCase()
    }

    return (charArr == charArr.reversed())
}

fun isValidPalindrome2(str:String):Boolean {
    val newString = str.filter { Character.isLetterOrDigit(it) }.toLowerCase()
    return newString == newString.reversed()
}

fun isPalindromeWithRegex(str:String):Boolean {
    var lower = str.toLowerCase()
    val regex = Regex("[^a-z0-9]")
    lower = regex.replace(lower, "")
    println("transformed: $lower")
    val reversed = lower.reversed()
    return (reversed == lower)
}
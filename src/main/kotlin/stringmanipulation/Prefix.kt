package stringmanipulation

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]

    for (i in strs.indices) {
        println(strs[i])
        while (strs[i].indexOf(prefix) != 0) {
            println("before prefix: $prefix")
            prefix = prefix.substring(0, prefix.length - 1)
            println("after prefix: $prefix")
            if(prefix.isEmpty()) return ""
        }
    }

    return prefix
}
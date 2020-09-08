package stack

import java.util.*
import kotlin.collections.HashMap

// LEETCODE STACK
// VALID PARENTHESES - 20

// ()[]{}
fun isValid(s: String): Boolean {
    val map = HashMap<Char, Char>()
    map[')'] = '('
    map['}'] = '{'
    map[']'] = '['

    val stack = Stack<Char>()

    for ( char in s){
        if (!map.containsKey(char)) {
            stack.push(char)
        } else {
            val topValue = if (stack.isEmpty()) "#"  else stack.pop()
            if(topValue != map[char]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}
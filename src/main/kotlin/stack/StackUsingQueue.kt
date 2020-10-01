package stack

import java.util.*

class QueueUsingStack {
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()


    fun push(element:Int){
        stack1.push(element)
    }

    fun pop():Int{
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.peek())
                stack1.pop()
            }
        }

        val data = stack2.peek()
        stack2.pop()

        return data
    }
}
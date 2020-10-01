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

class StackUsingQueue {
    private val q1 = LinkedList<Int>()
    private val q2 = LinkedList<Int>()

    fun push(element:Int) {
        if(q1.isEmpty()) {
            q1.push(element)
        } else {
            for (i in 0 until q1.size) {
                q2.add(q1.remove())
            }
            q1.add(element)

            for (i in 0 until q2.size) {
                q1.add(q2.remove())
            }
        }

    }

    fun pop():Int {
        return q1.remove()
    }
}
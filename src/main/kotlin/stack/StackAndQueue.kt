package stack

import java.util.*

class TwoStackForQueue {
    private val s1 = Stack<Int>()
    private val s2 = Stack<Int>()

    // 5,4,3,2,1 => stack1
    // 1,2,3,4,5 => stack2
    fun push(item:Int) {
        s1.push(item)
    }

    fun pop():Int {
        // must shift two stacks if 2nd stack is empty!
        if(s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop())
            }
        }

        return s2.pop()
    }
}

class TwoQueueForStack {
    private val inQ = LinkedList<Int>()
    private val outQ = LinkedList<Int>()

    // 5,4,3,2,1 => time
    // 5,4,3,2,1 => time (result)

    fun push(item:Int){
        inQ.add(item)
    }

    // Push or pop calculation is done on the first item of Linked List!
    fun pop():Int{
        if(outQ.isEmpty()) {
            while (!inQ.isEmpty()) {
                outQ.push(inQ.pop())
            }
        }

        return outQ.pop()
    }
}

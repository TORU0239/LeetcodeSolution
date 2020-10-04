
fun fibonacciRecur(n:Int):Int {
    if (n == 0) return 0
    if (n == 1 || n == 2) return 1
    return fibonacciRecur(n-1) + fibonacciRecur(n-2)
}

class Fibonacci {
    private val map = HashMap<Int, Int>()
    init {
        map[0] = 0
        map[1] = 1
        map[2] = 1
    }
    fun fibonacciMemoization(n:Int):Int {
        if (map[n] == null) {
            map[n] = fibonacciMemoization(n-1) + fibonacciMemoization(n-2)
        }

        return map[n]!!
    }
}

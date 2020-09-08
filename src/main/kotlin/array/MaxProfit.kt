package array

// LEETCODE ARRAY
// 121

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var minPrice = Int.MAX_VALUE

    println("=============")
    for (price in prices) {
        println("Price: $price")
        minPrice = if (minPrice > price) price else minPrice
        println("minPrice: $minPrice")
        profit = if (profit > (price - minPrice)) profit else (price - minPrice)
        println("profit: $profit")
        println("=============")
    }
    return profit
}
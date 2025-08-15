object EliudsEggs {
    fun eggCount(number: Int): Int {
        require(number >= 0) { "number must be non-negative" }
        var n = number
        var count = 0
        while (n != 0) {
            count++
            n = n and (n - 1)
        }
        return count
    }
}

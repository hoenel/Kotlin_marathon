object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        return (1 until limit) // lấy tất cả số từ 1 đến limit - 1
            .filter { n -> factors.any { f -> f != 0 && n % f == 0 } } // chọn số chia hết cho ít nhất 1 factor
            .sum() // cộng lại
    }
}

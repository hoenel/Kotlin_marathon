object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        var n = int
        val factors = mutableListOf<Int>()
        var divisor = 2

        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor)
                n /= divisor
            }
            divisor++
        }

        return factors
    }

    fun primeFactors(long: Long): List<Long> {
        var n = long
        val factors = mutableListOf<Long>()
        var divisor = 2L

        while (n > 1) {
            while (n % divisor == 0L) {
                factors.add(divisor)
                n /= divisor
            }
            divisor++
        }

        return factors
    }
}

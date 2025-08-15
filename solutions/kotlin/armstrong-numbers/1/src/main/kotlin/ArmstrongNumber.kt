object ArmstrongNumber {
    fun check(input: Int): Boolean {
        val digits = input.toString().map { it.digitToInt() }
        val power = digits.size

        fun intPow(base: Int, exponent: Int): Int {
            var result = 1
            repeat(exponent) { result *= base }
            return result
        }

        val sum = digits.sumOf { intPow(it, power) }
        return sum == input
    }
}

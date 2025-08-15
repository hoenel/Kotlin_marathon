class Squares(private val n: Int) {

    fun sumOfSquares(): Int {
        return (n * (n + 1) * (2 * n + 1)) / 6
    }

    fun squareOfSum(): Int {
        val sum = (n * (n + 1)) / 2
        return sum * sum
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}

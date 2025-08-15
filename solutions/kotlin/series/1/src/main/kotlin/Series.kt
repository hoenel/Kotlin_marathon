object Series {
    fun slices(n: Int, s: String): List<List<Int>> {
        require(n > 0) { "Slice length must be positive" }
        require(n <= s.length) { "Slice length must not be longer than string length" }

        return (0..(s.length - n)).map { i ->
            s.substring(i, i + n).map { it.digitToInt() }
        }
    }
}

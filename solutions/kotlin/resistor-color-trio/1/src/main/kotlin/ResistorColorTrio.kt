object ResistorColorTrio {

    fun text(vararg input: Color): String {
        require(input.size >= 3) { "Need at least three color bands" }

        val main = input[0].ordinal * 10 + input[1].ordinal
        val zeros = input[2].ordinal
        val value = main.toLong() * pow10(zeros)

        // Đổi đơn vị chỉ khi chia hết cho 1000 để giữ số nguyên đẹp
        val (display, unit) = when {
            value % 1_000_000_000L == 0L -> value / 1_000_000_000L to "gigaohms"
            value % 1_000_000L == 0L     -> value / 1_000_000L     to "megaohms"
            value % 1_000L == 0L         -> value / 1_000L         to "kiloohms"
            else                         -> value                  to "ohms"
        }

        return "$display $unit"
    }

    private fun pow10(n: Int): Long {
        var r = 1L
        repeat(n) { r *= 10 }
        return r
    }
}

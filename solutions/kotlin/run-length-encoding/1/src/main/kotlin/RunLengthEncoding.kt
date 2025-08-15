object RunLengthEncoding {

    fun encode(input: String): String {
        if (input.isEmpty()) return ""

        val result = StringBuilder()
        var count = 1
        var prev = input[0]

        for (i in 1 until input.length) {
            val curr = input[i]
            if (curr == prev) {
                count++
            } else {
                if (count > 1) result.append(count)
                result.append(prev)
                prev = curr
                count = 1
            }
        }
        if (count > 1) result.append(count)
        result.append(prev)
        return result.toString()
    }

    fun decode(input: String): String {
        val result = StringBuilder()
        var countStr = ""

        for (ch in input) {
            if (ch.isDigit()) {
                countStr += ch
            } else {
                val count = if (countStr.isEmpty()) 1 else countStr.toInt()
                repeat(count) { result.append(ch) }
                countStr = ""
            }
        }
        return result.toString()
    }
}

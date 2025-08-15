import kotlin.math.ceil
import kotlin.math.sqrt

object CryptoSquare {
    fun ciphertext(plaintext: String): String {
        // 1. Normalize: remove non-alphanumeric and lowercase
        val normalized = plaintext
            .lowercase()
            .filter { it.isLetterOrDigit() }

        if (normalized.isEmpty()) return ""

        // 2. Compute c and r
        val length = normalized.length
        val c = ceil(sqrt(length.toDouble())).toInt()
        val r = ceil(length.toDouble() / c).toInt()

        // 3. Build rows
        val rows = mutableListOf<String>()
        for (i in normalized.indices step c) {
            rows.add(normalized.substring(i, minOf(i + c, length)))
        }

        // 4. Build columns (read down)
        val chunks = mutableListOf<String>()
        for (col in 0 until c) {
            val sb = StringBuilder()
            for (row in 0 until r) {
                if (col < rows[row].length) {
                    sb.append(rows[row][col])
                } else {
                    sb.append(' ') // pad
                }
            }
            chunks.add(sb.toString())
        }

        // 5. Join with spaces
        return chunks.joinToString(" ")
    }
}

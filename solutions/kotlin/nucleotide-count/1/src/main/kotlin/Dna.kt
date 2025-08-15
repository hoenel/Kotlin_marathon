class Dna(dna: String) {

    private val counts: Map<Char, Int>

    init {
        val valid = setOf('A', 'C', 'G', 'T')
        val m = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

        for (ch in dna) {
            if (ch !in valid) {
                throw IllegalArgumentException("Invalid nucleotide: $ch")
            }
            m[ch] = m.getValue(ch) + 1
        }

        counts = m.toMap() // bất biến để trả ra an toàn
    }

    val nucleotideCounts: Map<Char, Int>
        get() = counts
}

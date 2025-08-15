fun transcribeToRna(dna: String): String =
    dna.map { ch ->
        when (ch) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException("Invalid nucleotide: $ch")
        }
    }.joinToString("")

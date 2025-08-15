fun translate(rna: String?): List<String> {
    if (rna.isNullOrEmpty()) return emptyList()

    val codonMap = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine", "UUC" to "Phenylalanine",
        "UUA" to "Leucine", "UUG" to "Leucine",
        "UCU" to "Serine", "UCC" to "Serine", "UCA" to "Serine", "UCG" to "Serine",
        "UAU" to "Tyrosine", "UAC" to "Tyrosine",
        "UGU" to "Cysteine", "UGC" to "Cysteine",
        "UGG" to "Tryptophan",
        "UAA" to "STOP", "UAG" to "STOP", "UGA" to "STOP"
    )

    val proteins = mutableListOf<String>()

    val codons = rna.chunked(3)
    for (codon in codons) {
        if (codon.length != 3) {
            throw IllegalArgumentException("Invalid codon")
        }
        val protein = codonMap[codon] ?: throw IllegalArgumentException("Invalid codon")
        if (protein == "STOP") break
        proteins.add(protein)
    }
    return proteins
}

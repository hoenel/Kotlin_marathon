object Isogram {

    fun isIsogram(input: String): Boolean {
        val seen = mutableSetOf<Char>()
        for (ch in input.lowercase()) {
            if (ch.isLetter()) {
                if (!seen.add(ch)) {
                    return false // đã tồn tại -> không phải isogram
                }
            }
        }
        return true
    }
}

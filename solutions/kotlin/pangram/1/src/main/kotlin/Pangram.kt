object Pangram {
    fun isPangram(input: String): Boolean {
        val letters = input
            .lowercase()
            .filter { it in 'a'..'z' }
            .toSet()
        return letters.size == 26
    }
}

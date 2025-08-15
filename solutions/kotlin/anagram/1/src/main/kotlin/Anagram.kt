class Anagram(private val target: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val targetLower = target.lowercase()
        val sortedTarget = targetLower.toCharArray().sorted()

        return anagrams.filter { candidate ->
            val candidateLower = candidate.lowercase()
            candidateLower != targetLower &&
                    candidateLower.toCharArray().sorted() == sortedTarget
        }.toSet()
    }
}

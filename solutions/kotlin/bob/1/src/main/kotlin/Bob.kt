object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()

        if (trimmed.isEmpty()) {
            return "Fine. Be that way!"
        }

        val isQuestion = trimmed.endsWith("?")
        val hasLetters = trimmed.any { it.isLetter() }
        val isYelling = hasLetters && trimmed == trimmed.uppercase()

        return if (isYelling && isQuestion) {
            "Calm down, I know what I'm doing!"
        } else if (isYelling) {
            "Whoa, chill out!"
        } else if (isQuestion) {
            "Sure."
        } else {
            "Whatever."
        }
    }
}

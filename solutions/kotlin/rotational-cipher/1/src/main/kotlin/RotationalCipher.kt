class RotationalCipher(private val key: Int) {

    fun encode(text: String): String {
        val shift = key % 26
        val result = StringBuilder()

        for (ch in text) {
            when {
                ch.isUpperCase() -> {
                    val shifted = 'A' + (ch - 'A' + shift) % 26
                    result.append(shifted)
                }
                ch.isLowerCase() -> {
                    val shifted = 'a' + (ch - 'a' + shift) % 26
                    result.append(shifted)
                }
                else -> {
                    result.append(ch)  // Giữ nguyên ký tự không phải chữ
                }
            }
        }
        return result.toString()
    }
}

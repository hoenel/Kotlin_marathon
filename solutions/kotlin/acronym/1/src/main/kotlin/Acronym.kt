object Acronym {
    fun generate(phrase: String): String {
        // Thay dấu gạch nối bằng khoảng trắng, loại bỏ các dấu câu khác
        val cleaned = phrase.replace("-", " ")
            .replace(Regex("[^A-Za-z\\s]"), "") // chỉ giữ chữ cái và khoảng trắng
        // Lấy chữ cái đầu mỗi từ, viết hoa
        return cleaned
            .split(Regex("\\s+")) // tách theo khoảng trắng
            .filter { it.isNotEmpty() }
            .map { it[0].uppercaseChar() }
            .joinToString("")
    }
}

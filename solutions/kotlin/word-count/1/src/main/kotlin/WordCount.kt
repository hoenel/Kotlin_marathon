object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        // Dùng regex để tách từ, giữ lại các apostrophe trong từ (như contractions)
        val regex = Regex("""\b[\w']+\b""")

        // Lấy danh sách từ, chuyển về chữ thường để không phân biệt hoa thường
        val words = regex.findAll(phrase.lowercase()).map { it.value }.toList()

        // Đếm số lần xuất hiện
        return words.groupingBy { it }.eachCount()
    }
}

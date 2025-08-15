class PhoneNumber(input: String) {

    val number: String

    init {
        // Kiểm tra nếu có ký tự không thuộc số, khoảng trắng, dấu ()-.+
        val invalidCharRegex = Regex("[^\\d\\s()\\-.+]")
        if (invalidCharRegex.containsMatchIn(input)) {
            throw IllegalArgumentException("Input contains invalid characters")
        }

        // Lấy tất cả chữ số
        var digits = input.filter { it.isDigit() }

        // Nếu 11 số, phải bắt đầu bằng 1
        if (digits.length == 11) {
            if (!digits.startsWith("1")) throw IllegalArgumentException("11 digits must start with 1")
            digits = digits.drop(1)
        }

        // Kiểm tra đúng format NANP
        if (digits.length != 10 ||
            digits[0] !in '2'..'9' ||   // Area code không bắt đầu bằng 0 hoặc 1
            digits[3] !in '2'..'9'      // Exchange code không bắt đầu bằng 0 hoặc 1
        ) {
            throw IllegalArgumentException("Invalid NANP number")
        }

        number = digits
    }
}

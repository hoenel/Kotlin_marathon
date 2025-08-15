object ResistorColorDuo {
    fun value(vararg colors: Color): Int {
        // Lấy giá trị của 2 màu đầu tiên
        return colors[0].ordinal * 10 + colors[1].ordinal
    }
}

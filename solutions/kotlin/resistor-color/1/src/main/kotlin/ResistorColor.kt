object ResistorColor {
    private val colorList = listOf(
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    )

    fun colorCode(input: String): Int {
        return colorList.indexOf(input.lowercase())
    }

    fun colors(): List<String> {
        return colorList
    }
}


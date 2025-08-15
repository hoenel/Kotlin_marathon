object Raindrops {
    fun convert(n: Int): String {
        val result = StringBuilder()

        if (n % 3 == 0) result.append("Pling")
        if (n % 5 == 0) result.append("Plang")
        if (n % 7 == 0) result.append("Plong")

        return if (result.isEmpty()) n.toString() else result.toString()
    }
}

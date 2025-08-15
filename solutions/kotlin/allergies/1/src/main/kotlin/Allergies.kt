class Allergies(private val score: Int) {

    fun isAllergicTo(allergen: Allergen): Boolean {
        val value = 1 shl allergen.ordinal
        return (score and value) != 0
    }

    fun getList(): List<Allergen> {
        return Allergen.values().filter { isAllergicTo(it) }
    }
}

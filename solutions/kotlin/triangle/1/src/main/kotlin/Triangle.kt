class Triangle<out T : Number>(a: T, b: T, c: T) {

    private val aVal = a.toDouble()
    private val bVal = b.toDouble()
    private val cVal = c.toDouble()

    init {
        require(aVal > 0 && bVal > 0 && cVal > 0) { "Sides must be greater than 0" }
        require(aVal + bVal >= cVal &&
                bVal + cVal >= aVal &&
                aVal + cVal >= bVal) { "Not a valid triangle" }
    }

    val isEquilateral: Boolean
        get() = aVal == bVal && bVal == cVal

    val isIsosceles: Boolean
        get() = aVal == bVal || bVal == cVal || aVal == cVal

    val isScalene: Boolean
        get() = aVal != bVal && bVal != cVal && aVal != cVal
}

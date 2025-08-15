enum class Relationship {
    EQUAL, SUBLIST, SUPERLIST, UNEQUAL
}

fun <T> List<T>.relationshipTo(other: List<T>): Relationship {
    return when {
        this == other -> Relationship.EQUAL
        this.isSublistOf(other) -> Relationship.SUBLIST
        other.isSublistOf(this) -> Relationship.SUPERLIST
        else -> Relationship.UNEQUAL
    }
}

private fun <T> List<T>.isSublistOf(superList: List<T>): Boolean {
    if (this.isEmpty()) return true
    if (this.size > superList.size) return false
    // Duyệt từng đoạn con liên tiếp
    for (i in 0..superList.size - this.size) {
        if (superList.subList(i, i + this.size) == this) return true
    }
    return false
}

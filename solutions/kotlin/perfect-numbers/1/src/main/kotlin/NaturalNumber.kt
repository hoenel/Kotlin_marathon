enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber > 0) { "Classification is only possible for natural numbers." }

    val aliquotSum = (1 until naturalNumber).filter { naturalNumber % it == 0 }.sum()

    return when {
        aliquotSum == naturalNumber -> Classification.PERFECT
        aliquotSum > naturalNumber -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
    }
}

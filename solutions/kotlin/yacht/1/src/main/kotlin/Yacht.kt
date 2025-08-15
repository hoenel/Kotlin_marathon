object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        val diceList = dices.toList()
        val counts = diceList.groupingBy { it }.eachCount()

        return when (category) {
            YachtCategory.ONES   -> (counts[1] ?: 0) * 1
            YachtCategory.TWOS   -> (counts[2] ?: 0) * 2
            YachtCategory.THREES -> (counts[3] ?: 0) * 3
            YachtCategory.FOURS  -> (counts[4] ?: 0) * 4
            YachtCategory.FIVES  -> (counts[5] ?: 0) * 5
            YachtCategory.SIXES  -> (counts[6] ?: 0) * 6

            YachtCategory.FULL_HOUSE -> {
                if (counts.size == 2 && counts.values.sorted() == listOf(2, 3))
                    diceList.sum()
                else 0
            }

            YachtCategory.FOUR_OF_A_KIND -> {
                val fourKindFace = counts.entries.find { it.value >= 4 }?.key
                if (fourKindFace != null) fourKindFace * 4 else 0
            }

            YachtCategory.LITTLE_STRAIGHT ->
                if (diceList.toSet() == setOf(1, 2, 3, 4, 5)) 30 else 0

            YachtCategory.BIG_STRAIGHT ->
                if (diceList.toSet() == setOf(2, 3, 4, 5, 6)) 30 else 0

            YachtCategory.CHOICE -> diceList.sum()

            YachtCategory.YACHT ->
                if (counts.size == 1) 50 else 0
        }
    }
}

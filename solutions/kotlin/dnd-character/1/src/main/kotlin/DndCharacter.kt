import kotlin.math.floor
import kotlin.random.Random

class DndCharacter {
    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {
        fun ability(): Int {
            // Tung 4 viên xúc xắc (1..6)
            val rolls = List(4) { Random.nextInt(1, 7) }
            // Cộng 3 giá trị lớn nhất
            return rolls.sortedDescending().take(3).sum()
        }

        fun modifier(score: Int): Int {
            return floor((score - 10) / 2.0).toInt()
        }
    }
}

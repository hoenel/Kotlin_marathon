class Clock(private var hours: Int, private var minutes: Int = 0) {

    init {
        normalize()
    }

    private fun normalize() {
        val totalMinutes = ((hours * 60) + minutes).floorMod(24 * 60)
        hours = totalMinutes / 60
        minutes = totalMinutes % 60
    }

    fun add(minutes: Int) {
        this.minutes += minutes
        normalize()
    }

    fun subtract(minutes: Int) {
        this.minutes -= minutes
        normalize()
    }

    override fun toString(): String {
        return "%02d:%02d".format(hours, minutes)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clock) return false
        return hours == other.hours && minutes == other.minutes
    }

    override fun hashCode(): Int {
        return hours * 60 + minutes
    }

    // Kotlin không có floorMod cho Int, tự viết:
    private fun Int.floorMod(mod: Int): Int {
        val r = this % mod
        return if (r < 0) r + mod else r
    }
}

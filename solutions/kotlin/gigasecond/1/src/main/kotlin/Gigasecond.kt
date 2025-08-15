import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Duration

class Gigasecond(dateTime: LocalDateTime) {

    constructor(date: LocalDate) : this(date.atStartOfDay())

    val date: LocalDateTime = dateTime.plusSeconds(1_000_000_000)
}

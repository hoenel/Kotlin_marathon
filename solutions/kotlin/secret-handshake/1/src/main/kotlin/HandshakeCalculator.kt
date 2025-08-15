object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val signals = mutableListOf<Signal>()

        if (number and 1 != 0) signals.add(Signal.WINK)
        if (number and 2 != 0) signals.add(Signal.DOUBLE_BLINK)
        if (number and 4 != 0) signals.add(Signal.CLOSE_YOUR_EYES)
        if (number and 8 != 0) signals.add(Signal.JUMP)

        return if (number and 16 != 0) signals.asReversed() else signals
    }
}

class SpaceAge(private val seconds: Int) {

    private val earthYearSeconds = 31557600.0

    private val orbitalPeriods = mapOf(
        "Mercury" to 0.2408467,
        "Venus" to 0.61519726,
        "Earth" to 1.0,
        "Mars" to 1.8808158,
        "Jupiter" to 11.862615,
        "Saturn" to 29.447498,
        "Uranus" to 84.016846,
        "Neptune" to 164.79132
    )

    fun onEarth(): Double = ageOnPlanet("Earth")
    fun onMercury(): Double = ageOnPlanet("Mercury")
    fun onVenus(): Double = ageOnPlanet("Venus")
    fun onMars(): Double = ageOnPlanet("Mars")
    fun onJupiter(): Double = ageOnPlanet("Jupiter")
    fun onSaturn(): Double = ageOnPlanet("Saturn")
    fun onUranus(): Double = ageOnPlanet("Uranus")
    fun onNeptune(): Double = ageOnPlanet("Neptune")

    private fun ageOnPlanet(planet: String): Double {
        val period = orbitalPeriods[planet] ?: 1.0
        return seconds / (earthYearSeconds * period)
    }
}

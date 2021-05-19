import kotlin.math.pow

fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        // ide required else branch
        else -> "No race Declared!"
    }
    val karma = (Math.random().pow((110 - healthPoints) / 100.0) * 20 ).toInt()
    println(karma)

    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when (karma) {
        in 0..5 -> "Aura is Red"
        in 6..10 -> "Aura is Orange"
        in 11..15 -> "Aura is Purple"
        in 16..20 -> "Aura is Green"
        // else statement required
        else -> "No Aura"
    }

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // Player status
    println("(Aura: $auraColor) "  +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

}
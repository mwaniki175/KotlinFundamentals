fun main() {
    println("Enter History score:")
    val score = readLine()?.toIntOrNull() ?: return

    val grade = when {
        score > 100 -> "N/A"
        score in 90..100 -> "A"
        score in 80..89 -> "B"
        score in 70..79 ->"C"
        score in 60..69 -> "D"
        else -> "E"
    }

    println("GRADE: $grade")
}
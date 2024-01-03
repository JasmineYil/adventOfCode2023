package dayOne

import java.io.File

fun main() {
    val puzzleFile = "src/dayOne/puzzleInputClarissa.txt"
    val puzzleInput = File(puzzleFile).readText()
    val puzzleValues = extractPuzzleValues(puzzleInput)
    val sum = puzzleValues.sum()

    println("Puzzle values: $puzzleValues")
    println("Sum of puzzle values: $sum")
}
fun extractPuzzleValues(puzzleInput: String): List<Int> {
    val lines = puzzleInput.lines()
    val puzzleValues = mutableListOf<Int>()

    for (line in lines) {
        val firstDigit = line.firstOrNull { it.isDigit() }
        val lastDigit = line.lastOrNull { it.isDigit() }

        if (firstDigit != null && lastDigit != null) {
            val value = "$firstDigit$lastDigit".toInt()
            puzzleValues.add(value)
        }
    }
    return puzzleValues
}

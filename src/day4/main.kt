package day4

import java.io.File

fun main() {
    val puzzleFile = "src/day4/puzzleInput4.txt"
    val lines = File(puzzleFile).readLines()

    val results = lines.map { line ->
        val formattedLine = line.replaceFirst(Regex("^[^:]+: "), "")
        val (left, right) = formattedLine.split("|").map { it.trim() }

        val myNumbers = left.split("\\s+".toRegex()).map { it.toInt() }
        val winningNumbers = right.split("\\s+".toRegex()).map { it.toInt() }

        calculateTotalScore(myNumbers, winningNumbers)
    }
    val overallScore = results.sum()
    println("Gesamtscore: $overallScore")
}

fun calculateTotalScore(myNumbers: List<Int>, winningNumbers: List<Int>): Int {
    var numberOfMatches = 0

    for (myNumber in myNumbers) {
        if (winningNumbers.contains(myNumber)) {
            numberOfMatches++
        }
    }

    numberOfMatches = if (numberOfMatches > 1) {
        Math.pow(2.0, numberOfMatches.toDouble() - 1).toInt()
    } else {
        numberOfMatches
    }
    return numberOfMatches
}
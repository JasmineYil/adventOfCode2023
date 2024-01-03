package daySix

fun main() {
    daySixPartOne()
    daySixPartTwo()
}

fun daySixPartOne(){
    println("""
        Advent of Code 2023
        Day 6 - Part 1
        """)

    var testExample = 0L
    testExample = numOfTimesToBeatRecord(7 , 9 )
    testExample *= numOfTimesToBeatRecord(15 , 40 )
    testExample *= numOfTimesToBeatRecord(30 , 200 )
    println("Total number of times to beat the record with Example Numbers: $testExample")


    var puzzleInputJasmine = 0L
    puzzleInputJasmine = numOfTimesToBeatRecord(63 , 411 )
    puzzleInputJasmine *= numOfTimesToBeatRecord(78 , 1274 )
    puzzleInputJasmine *= numOfTimesToBeatRecord(94 , 2047 )
    puzzleInputJasmine *= numOfTimesToBeatRecord(68 , 1035 )
    println("Total number of times to beat the record with Puzzle Input Numbers Jasmine: $puzzleInputJasmine")

    var puzzleInputClarissa = 0L
    puzzleInputClarissa = numOfTimesToBeatRecord(47 , 282 )
    puzzleInputClarissa *= numOfTimesToBeatRecord(70 , 1079 )
    puzzleInputClarissa *= numOfTimesToBeatRecord(75 , 1147 )
    puzzleInputClarissa *= numOfTimesToBeatRecord(66 , 1062 )
    println("Total number of times to beat the record with Puzzle Input Numbers Clarissa: $puzzleInputClarissa")
}

fun daySixPartTwo(){
    println("""
        Advent of Code 2023
        Day 6 - Part 2
        """)

    var testExample = 0L
    testExample = numOfTimesToBeatRecord(71530 , 940200 )
    println("Total number of ways to beat the record with Example Numbers: $testExample")

    var puzzleInputJasmine = 0L
    puzzleInputJasmine = numOfTimesToBeatRecord(63789468 , 411127420471035 )
    println("Total number of ways to beat the record with Puzzle Input Numbers Jasmine: $puzzleInputJasmine")

    var puzzleInputClarissa = 0L
    puzzleInputClarissa = numOfTimesToBeatRecord(47707566 , 282107911471062 )
    println("Total number of ways to beat the record with Puzzle Input Numbers Clarissa: $puzzleInputClarissa")
}

fun numOfTimesToBeatRecord(time: Long, record: Long): Long {
    var num = 0L

    for (i in 0 until time) {
        val timeLeft = time - i
        if (i * timeLeft > record) {
            num++
        }
    }
    return num
}

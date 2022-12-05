import puzzles.day1
import puzzles.day2
import puzzles.day3
import puzzles.day4

fun main(args: Array<String>) {
    puzzle { day1() }
    puzzle { day2() }
    puzzle { day3() }
    puzzle { day4() }
}

private fun puzzle(puzzle: () -> Unit) {
    puzzle()
    println()
}
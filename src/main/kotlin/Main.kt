import puzzles.day1
import puzzles.day2
import puzzles.day3

fun main(args: Array<String>) {
    puzzle { day1() }
    puzzle { day2() }
    puzzle { day3() }
}

private fun puzzle(puzzle: () -> Unit) {
    puzzle()
    println()
}
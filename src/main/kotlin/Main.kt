import puzzles.day1
import puzzles.day2

fun main(args: Array<String>) {
    puzzle { day1() }
    puzzle { day2() }
}

private fun puzzle(puzzle: () -> Unit) {
    puzzle()
    println()
}
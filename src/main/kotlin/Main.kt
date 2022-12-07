import puzzles.*

fun main(args: Array<String>) {
    puzzle { day1() }
    puzzle { day2() }
    puzzle { day3() }
    puzzle { day4() }
   //puzzle { day5() }
    puzzle { day6() }
    puzzle { day7() }
}

private fun puzzle(puzzle: () -> Unit) {
    puzzle()
    println()
}
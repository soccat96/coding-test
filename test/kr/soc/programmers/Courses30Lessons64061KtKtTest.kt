package kr.soc.programmers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Courses30Lessons64061KtKtTest {
    @Test
    fun solution() {
        var board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 3),
            intArrayOf(0, 2, 5, 0, 1),
            intArrayOf(4, 2, 4, 4, 2),
            intArrayOf(3, 5, 1, 3, 1)
        )
        var moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        assertEquals(4, Courses30lessons64061kt().solution(board, moves))
    }
}
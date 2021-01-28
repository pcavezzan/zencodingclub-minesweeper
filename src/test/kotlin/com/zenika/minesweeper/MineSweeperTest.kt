package com.zenika.minesweeper

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class MineSweeperTest {

//    @Test
//    fun `game is lost when a mine is revealed`() {
//        val game = Game()
//
//        assertEquals(true, game.isLost())
//    }

    @Test
    fun `new game is in progress by default`() {
        val game = Game(Grid(emptyList()))

        assertTrue(game.isInProgress())
    }

    @Test
    fun `new game starts with empty board`() {
        val game = Game(Grid(emptyList()))
        val expectedBoard = Board(emptyList())

        assertEquals(expectedBoard, game.board)
    }

    @Test
    fun `revealed cell is displayed on the board`() {
        val game = Game(Grid(listOf(listOf("💣", ""), listOf("", ""))))
        val position = Position(0, 1)

        game.revealCellAt(position)

        val expectedBoard = Board(listOf(listOf("", ""), listOf("1", "")))
        assertEquals(expectedBoard, game.board)
    }
}

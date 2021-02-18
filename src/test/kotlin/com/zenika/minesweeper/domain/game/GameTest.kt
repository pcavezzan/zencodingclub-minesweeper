package com.zenika.minesweeper.domain.game

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

//    @Test
//    fun `game is lost when a mine is revealed`() {
//        val game = Game()
//
//        assertEquals(true, game.isLost())
//    }

    @Test
    fun `new game is ready by default`() {
        val game = Game("", GameConfiguration(1, 1))

        val board = game.board()

        assertThat(board.status).isEqualTo(Status.READY)
    }

    @Test
    fun `new game starts with empty board`() {
        val game = Game("", GameConfiguration(1, 2))

        val board = game.board()

        assertThat(board.grid).isEqualTo(listOf(listOf(CellState.COVERED, CellState.COVERED)))
    }

//    @Test
//    fun `revealed cell is displayed on the board`() {
//        val game = Game(Grid(listOf(listOf("💣", ""), listOf("", ""))))
//        val position = Position(0, 1)
//
//        game.revealCellAt(position)
//
//        val expectedBoard = Board(listOf(listOf("", ""), listOf("1", "")))
//        assertEquals(expectedBoard, game.board)
//    }
}

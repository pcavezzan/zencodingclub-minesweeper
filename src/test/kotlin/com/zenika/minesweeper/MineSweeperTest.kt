package com.zenika.minesweeper

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MineSweeperTest {

    @Test
    fun `game is lost when a mine is revealed`() {
        val game = Game()
        assertEquals(true, game.isLost())
    }
}

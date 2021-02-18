package com.zenika.minesweeper.domain.game

class Game  {
    private val gameIdentifier: String

    constructor(gameIdentifier: String, gameConfiguration: GameConfiguration) {
        this.gameIdentifier = gameIdentifier
    }

    fun board() = Board(Status.READY)
}

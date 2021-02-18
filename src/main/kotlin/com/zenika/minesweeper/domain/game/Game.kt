package com.zenika.minesweeper.domain.game

class Game  {
    private val gameIdentifier: String
    private var status: Status
    private val grid: Grid

    constructor(gameIdentifier: String, gameConfiguration: GameConfiguration) {
        this.gameIdentifier = gameIdentifier
        this.status = Status.READY
        this.grid = Grid(gameConfiguration.height, gameConfiguration.width)
    }

    fun board() = Board(this.status, toCells(this.grid))

    private fun toCells(grid: Grid): List<List<CellState>> {
        val rows = mutableListOf<List<CellState>>()
        for (i in 0 until grid.height) {
            val cells = mutableListOf<CellState>()
            for (j in 0 until grid.width) {
                cells.add(CellState.COVERED)
            }
            rows.add(cells)
        }
        return rows
    }
}

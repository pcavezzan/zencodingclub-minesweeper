package com.zenika.minesweeper

class Game(private val grid: Grid) {

    val cells: MutableList<MutableList<Cell>> = mutableListOf()

    init {
        grid.cells.forEachIndexed { y, gridRow ->
            val row = mutableListOf<Cell>()
            gridRow.forEachIndexed { x, _ ->
                row.add(Cell(adjacentMinesCount(x, y)))
            }
            cells.add(row)
        }
    }


    val board: Board = Board(emptyList())

    fun isLost() = true

    fun isInProgress() = true

    fun revealCellAt(position: Position) {
        cells[position.y][position.x]
        // TODO Stocké un état dans le cell.
    }

    private fun adjacentMinesCount(x: Int, y: Int): Int {
        val topLeft = mineAt(x - 1, y - 1)
        val top = mineAt(x, y - 1)
        val topRight = mineAt(x + 1, y - 1)
        val left = mineAt(y, x - 1)
        val right = mineAt(y, x + 1)
        val bottomLeft = mineAt(y + 1, x - 1)
        val bottom = mineAt(y + 1, x)
        val bottomRight = mineAt(y + 1, x + 1)
        return bottomRight + bottom + bottomLeft + right + left + topRight + top + topLeft
    }

    private fun mineAt(x: Int, y: Int): Int {
        if (y < 0 || x < 0 || y >= grid.cells.size || x >= grid.cells[0].size) {
            return 0
        }
        return if (grid.cells[y][x] == "💣") 1 else 0
    }
}

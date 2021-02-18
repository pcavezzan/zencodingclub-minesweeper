package com.zenika.minesweeper.domain.game

data class Board(val status: Status, val grid: List<List<CellState>>)

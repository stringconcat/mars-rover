package com.stringconcat.marsrover

data class Coordinate(
    val x: Int,
    val y: Int
) {
    fun incY(): Coordinate {
        return Coordinate(x, y + 1)
    }
}
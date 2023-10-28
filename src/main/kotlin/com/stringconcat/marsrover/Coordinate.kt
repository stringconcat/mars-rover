package com.stringconcat.marsrover

data class Coordinate(
    val x: Int,
    val y: Int
) {
    fun inRectangleOf(other: Coordinate): Boolean {
        return other.x >= x && other.y >= y && x >= 0 && y >= 0
    }

    companion object {
        val ZERO = Coordinate(0, 0)
    }

}

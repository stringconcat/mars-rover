package com.stringconcat.marsrover

class Plateau(
    val height: Int,
    val width: Int
) {
    init {
        if (height <= 0 || width <= 0) {
            throw IllegalArgumentException("Plateau should have positive values")
        }
    }
    fun width() = width

    fun height() = height
    fun placeRover(rover: Rover): Rover {
        if (!rover.coordinate.inRectangleOf(Coordinate(width - 1, height - 1))) {
            throw IllegalArgumentException("Rover placed on the wrong cell")
        }
        return rover
    }

    companion object {
        fun createByTopRightCorner(top: Int, right: Int): Plateau {
            return Plateau(top + 1, right + 1)
        }
    }

}

package com.stringconcat.marsrover

class Rover(
    var coordinates: Coordinate,
    var direction: Direction

) {
    fun turnLeft() {
        TODO("Not yet implemented")
    }

    fun move() {
        coordinates = coordinates.incY()
    }

    fun turnRight() {
        TODO("Not yet implemented")
    }

    fun direction(): Direction {
        TODO("Not yet implemented")
    }

}

package com.stringconcat.marsrover

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class PlateauTest {


    @Test
    fun `when plateau created with correct coordinates - do not throw exception`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 5)
    }

    @Test
    fun `when plateau created - then plateau has correct coordinates`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 6)
        plateau.width() shouldBe 7
        plateau.height() shouldBe 6
    }

    @Test
    fun `coordinates are negative - exceptions will be thrown`() {
        shouldThrow<IllegalArgumentException> {
            Plateau.createByTopRightCorner(top = -1, right = 2) }
    }

    @Test
    fun `when rover lended on plateau - rover will be returned with coordinates`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 6)
        val rover = plateau.placeRover(Rover(Coordinate.ZERO, Direction.NORTH))
        rover shouldBe Rover(Coordinate.ZERO, Direction.NORTH)
    }

    @Test
    fun `when rover placed on not existed cell - then throw exception`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 6)
        shouldThrow<IllegalArgumentException> {
            plateau.placeRover(Rover(Coordinate(55, 55), Direction.NORTH))
        }
    }

    @Test
    fun `when rover placed on negative cell - then throw exception`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 6)
        shouldThrow<IllegalArgumentException> {
            plateau.placeRover(Rover(Coordinate(-1, 0), Direction.NORTH))
        }
    }

}
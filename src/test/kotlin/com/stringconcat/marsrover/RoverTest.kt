package com.stringconcat.marsrover

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RoverTest {

    @Test
    fun `rover created - with initial coordinates`() {
        val rover = Rover(Coordinate(x = 0, y = 0), Direction.NORTH)

        rover.coordinates shouldBe Coordinate(x = 0, y = 0)
        rover.direction shouldBe Direction.NORTH
    }

    @Test
    fun `north faced rover moves - increase y`() {
        val rover = Rover(Coordinate(0, 0), Direction.NORTH)
        rover.move()

        rover.coordinates shouldBe Coordinate(0, 1)
        rover.direction shouldBe Direction.NORTH
    }
}
package com.stringconcat.marsrover

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RoverTest {

    @Test
    fun `two rovers on the same coordinate and same direction are equal`() {
        Rover(Coordinate.ZERO, Direction.NORTH) shouldBe Rover(Coordinate.ZERO, Direction.NORTH)
    }
}
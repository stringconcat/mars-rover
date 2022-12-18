package com.stringconcat.marsrover

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class CoordinateTest {

    @Test
    fun `the same coordinates are equal`() {
        Coordinate(0, 0) shouldBe Coordinate(0, 0)
        Coordinate(0, 1) shouldBe Coordinate(0, 1)
    }

    @Test
    fun `not the same coordinates are NOT equal`() {
        Coordinate(0, 0) shouldNotBe  Coordinate(0, 5)
        Coordinate(5, 1) shouldNotBe  Coordinate(6, 1)
    }

    @Test
    fun `increment y`() {
        Coordinate(0, 0).incY() shouldBe Coordinate(0, 1)
    }
}
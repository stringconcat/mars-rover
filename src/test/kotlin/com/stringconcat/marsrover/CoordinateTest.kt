package com.stringconcat.marsrover

import io.kotest.matchers.shouldBe
import kotlin.test.Test

class CoordinateTest {

    @Test
    fun `coordinate created -- do not throw exceptions`() {
        Coordinate(5, 5)
    }

    @Test
    fun `two the same coordinates are equal to each other`() {
        Coordinate(5, 5) shouldBe Coordinate(5, 5)
    }

    @Test
    fun `when other coordinates belongs to the rectangle - true`() {
        Coordinate(3, 3).inRectangleOf(Coordinate(5, 5)) shouldBe true
    }

    @Test
    fun `when other coordinate does not belong to the rectange - false`() {
        Coordinate(50, 50).inRectangleOf(Coordinate(5, 5)) shouldBe false
    }

    @Test
    fun `when our coordinate is negative - then false`() {
        Coordinate(-3, -3).inRectangleOf(Coordinate(5, 5)) shouldBe false
    }

    // check negatives
}
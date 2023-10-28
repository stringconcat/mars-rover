package com.stringconcat.marsrover

import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldContainOnly
import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    /**
     * Пример тестового ввода:\
     * 5 5 ← верхний правый угол плато\
     * 1 2 N ← текущее положение и направление камеры первого марсохода\
     * LMLMLMLMM ← управление положением первого марсохода\
     * 3 3 E ← текущее положение и направление камеры второго марсохода\
     * MMRMMRMRRM ← управление положением второго марсохода
     *
     * Пример тестового вывода:\
     * 1 3 N ← конечное положение и направление камеры первого марсохода\
     * 5 1 E ← конечное положение и направление камеры второго марсохода\
     */
//    fun `option 1 controller`() {
//        val ce = CommandExecuter()
//        ce.execute("5 5")
//        ce.execute("1 2 N")
//        ce.execute("LMLMLMLMM")
//        ce.execute("3 3 E")
//        val finalCoordinates: List<String> = ce.execute("MMRMMRMRRM")
//        finalCoordinates shouldContainOnly listOf("1 3 N", "5 1 E")
//    }
//
//    fun `option 2 useCase`() {
//        val rm = RoverMissionUseCase()
//        val commands = listOf(
//            CreatePlateauCommand(5, 5),
//            LandRover(Coordinate(1, 2), North),
//            TurnLeftCommand(),
//            MoveComamnd(),
//            LandRover(Coordinate(3, 3), East),
//
//        )
//        val coordinates: List<Vektor> = rm.execute(commands)
//        coordinates shouldContainExactly listOf(
//            Vektor(Coordinate(1, 3), North),
//            Vektor(Coordinate(5, 1), East),
//        )
//    }

    fun `option 3 domain`() {
        val plateau = Plateau.createByTopRightCorner(top = 5, right = 5)
        val rover1 = plateau.placeRover(Rover(Coordinate(1, 2), Direction.NORTH))
        rover1.turnLeft()
        rover1.move()
        //

        val rover2 = plateau.placeRover(Rover(Coordinate(3, 3), East))
        rover2.turnRight()

        rover1.state shouldBe Vektor(Coordinate(1, 3), North)
        rover2.state shouldBe Vektor(Coordinate(5, 1), East)

    }

    /** readme
     * а что будет если мы передали команду создания плато 2 раза
     */

}
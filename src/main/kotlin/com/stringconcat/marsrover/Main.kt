import com.stringconcat.marsrover.Coordinate
import com.stringconcat.marsrover.Direction
import com.stringconcat.marsrover.Plateu
import com.stringconcat.marsrover.Rover

fun main(args: Array<String>) {
    val rover = Rover(Coordinate(0, 0), Direction.NORTH)
    val mars = Plateu(width = 20, heigh = 20)
    mars.land(rover)

    rover.turnLeft()
    rover.move()
    rover.turnRight()

    println(rover.coordinates)
    println(rover.direction())

}
package examle

interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop() {
        println("Останавливаемся...")
    }
}
class Car (
    override val model: String,
    override val number: String
) : Movable {
    override var speed = 60
    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }
}

class Aircraft (
    override val model: String,
    override val number: String
) : Movable {
    override var speed = 600
    override fun move(){
        println("Летим на самолете со скоростью $speed км/ч")
    }
    override fun stop() = println("Приземляемся...")
}

fun travel(obj: Movable) = obj.move()

fun main() {
    val car = Car("Lada", "134ABC")
    val aircraft = Aircraft("Boeing", "777")
    travel(car)
    travel(aircraft)
    aircraft.move()
    aircraft.stop()
}

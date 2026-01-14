interface Worker{
    fun work()
}
interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun work() = println("$name работает")
    override fun study() = println("$name учится")
}

fun main() {
    val pavel = WorkingStudent("Pavel")
    pavel.work()
    pavel.study()
}
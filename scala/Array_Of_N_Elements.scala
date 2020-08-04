object Solution extends App {
    val readInt = scala.io.StdIn.readInt

    def f(num:Int) : List[Int] = {
        val list = (0 until num).toList

        return list
    }

    println(f(readInt))
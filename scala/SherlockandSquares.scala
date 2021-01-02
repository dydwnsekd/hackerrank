import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the squares function below.
    def squares(a: Int, b: Int): Int = {
        var result = (math.sqrt(b).floor) - (math.sqrt(a).ceil)
        if (result < 0)
            return 0
        else
            return (result + 1).toInt
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = stdin.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val ab = stdin.readLine.split(" ")

            val a = ab(0).trim.toInt

            val b = ab(1).trim.toInt

            val result = squares(a, b)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

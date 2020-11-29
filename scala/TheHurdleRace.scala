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

    // Complete the hurdleRace function below.
    def hurdleRace(k: Int, height: Array[Int]): Int = {
        val max_height = height.max
        
        if (k > max_height)
            return 0
        else
            return max_height - k
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nk = stdin.readLine.split(" ")

        val n = nk(0).trim.toInt

        val k = nk(1).trim.toInt

        val height = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = hurdleRace(k, height)

        printWriter.println(result)

        printWriter.close()
    }
}

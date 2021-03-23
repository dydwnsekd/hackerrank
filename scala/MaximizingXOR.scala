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

    // Complete the maximizingXor function below.
    def maximizingXor(l: Int, r: Int): Int = {
        var max_value = 0
        for (i <- l to r)
            for (j <- l to r)
                if (max_value < (i^j))
                    max_value = i^j
    
        return max_value

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val l = stdin.readLine.trim.toInt

        val r = stdin.readLine.trim.toInt

        val result = maximizingXor(l, r)

        printWriter.println(result)

        printWriter.close()
    }
}

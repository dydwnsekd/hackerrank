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

    // Complete the beautifulDays function below.
    def beautifulDays(i: Int, j: Int, k: Int): Int = {
        var count = 0
        
        for (d <- i to j) {
            if (((d - d.toString.reverse.toInt).abs / k.toFloat) % 1 == 0.0)
                count += 1
        }
        
        return count
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val ijk = stdin.readLine.split(" ")

        val i = ijk(0).trim.toInt

        val j = ijk(1).trim.toInt

        val k = ijk(2).trim.toInt

        val result = beautifulDays(i, j, k)

        printWriter.println(result)

        printWriter.close()
    }
}

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

    // Complete the libraryFine function below.
    def libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int = {
        if (y1 > y2)
            return 10000
        else if (m1 > m2 && y1 == y2)
            return (m1-m2) * 500
        else if (d1 > d2 && y1 == y2 && m1 == m2)
            return (d1-d2) * 15
        else
            return 0

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val d1M1Y1 = stdin.readLine.split(" ")

        val d1 = d1M1Y1(0).trim.toInt

        val m1 = d1M1Y1(1).trim.toInt

        val y1 = d1M1Y1(2).trim.toInt

        val d2M2Y2 = stdin.readLine.split(" ")

        val d2 = d2M2Y2(0).trim.toInt

        val m2 = d2M2Y2(1).trim.toInt

        val y2 = d2M2Y2(2).trim.toInt

        val result = libraryFine(d1, m1, y1, d2, m2, y2)

        printWriter.println(result)

        printWriter.close()
    }
}

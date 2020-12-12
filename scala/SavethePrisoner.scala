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

    // Complete the saveThePrisoner function below.
    def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
        val count = ((m + s - 1) % n)
        if (count == 0)
            return n
        return count

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = stdin.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val nms = stdin.readLine.split(" ")

            val n = nms(0).trim.toInt

            val m = nms(1).trim.toInt

            val s = nms(2).trim.toInt

            val result = saveThePrisoner(n, m, s)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

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

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val t = stdin.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val nk = stdin.readLine.split(" ")
            val n = nk(0).trim.toInt
            val k = nk(1).trim.toInt

            if (((k-1) | k) <= n)
                println(k-1)
            else
                println(k-2)
        }
    }
}

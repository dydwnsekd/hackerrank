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

    // Complete the staircase function below.
    def staircase(n: Int) {
        for (i <- 1 to n) {
            print(" "*(n-i))
            println("#" * i)
        }

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}

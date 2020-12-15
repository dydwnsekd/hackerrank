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

    // Complete the jumpingOnClouds function below.
    def jumpingOnClouds(c: Array[Int], k: Int): Int = {
        var energy = 100
        val n = c.length
        var i = k % n 
        energy -= c(i) * 2 + 1 
        while (i != 0){
            i = (i + k) % n
            energy -= c(i) * 2 + 1
        }
        return energy
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val nk = stdin.readLine.split(" ")

        val n = nk(0).trim.toInt

        val k = nk(1).trim.toInt

        val c = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = jumpingOnClouds(c, k)

        printWriter.println(result)

        printWriter.close()
    }
}

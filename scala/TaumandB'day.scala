import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    def taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long = {
        var value: Long = 0
        if (bc > z + wc)
            value = wc.toLong * w + (z+wc).toLong * b
        else if (wc > z + bc)
            value = bc.toLong * b + (z+bc).toLong * w
        else
            value = bc.toLong * b + wc.toLong * w
            
        return value
    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = StdIn.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

            val b = firstMultipleInput(0).toInt

            val w = firstMultipleInput(1).toInt

            val secondMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

            val bc = secondMultipleInput(0).toInt

            val wc = secondMultipleInput(1).toInt

            val z = secondMultipleInput(2).toInt

            val result = Result.taumBday(b, w, bc, wc, z)

            printWriter.println(result)
        }

        printWriter.close()
    }
}

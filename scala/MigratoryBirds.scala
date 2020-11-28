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

object Solution {

    // Complete the migratoryBirds function below.
    def migratoryBirds(arr: Array[Int]): Int = {
        var bird_count = ArrayBuffer(0,0,0,0,0)
        for (i <- arr)
            bird_count(i-1) += 1
            
        //return (bird_count.index(max(bird_count))+1)
        return (bird_count.indexOf(bird_count.max) + 1)

    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arrCount = StdIn.readLine.trim.toInt

        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val result = migratoryBirds(arr)

        printWriter.println(result)

        printWriter.close()
    }
}

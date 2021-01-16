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

    def pickingNumbers(a: Array[Int]): Int = {
        var max_length = 0
        var search_num = ArrayBuffer[Int]()
        var picknum_1 = 0
        var picknum_2 = 0
        for (i <- a) {
            if (!search_num.contains(i)) {
                search_num+=i
                picknum_1 = a.count(_ == i) + a.count(_ == i-1)
                picknum_2 = a.count(_ == i) + a.count(_ == i+1)
                if (picknum_1 > picknum_2 && max_length < picknum_1)
                    max_length = picknum_1
                else if (max_length < picknum_2)
                    max_length = picknum_2
            }
        }
                    
        return max_length

    }

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = StdIn.readLine.trim.toInt

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val result = Result.pickingNumbers(a)

        printWriter.println(result)

        printWriter.close()
    }
}

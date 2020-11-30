import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable.ListBuffer

object Solution {

    // Complete the designerPdfViewer function below.
    def designerPdfViewer(h: Array[Int], word: String): Int = {
        var word_height = new ListBuffer[Int]()
        val wordToInt = word.map(_.toInt-97)
        for ( i <- wordToInt )
            word_height += h(i)
            
        return word_height.max * word.length
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val h = stdin.readLine.split(" ").map(_.trim.toInt)
        val word = stdin.readLine

        val result = designerPdfViewer(h, word)

        printWriter.println(result)

        printWriter.close()
    }
}

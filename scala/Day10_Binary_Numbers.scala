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

        val n = stdin.readLine.trim.toInt

        val bin_n = n.toBinaryString
        var temp = 0
        var count = 0

        for (i <- bin_n)
        {   
            if(i.toString=="1")
                temp += 1
            else
            {   
                if (count < temp)
                    count = temp
                temp = 0
            }
        }
        
        if (count < temp)
        {
            count = temp
            temp = 0
        }
        print (count)
    }
}

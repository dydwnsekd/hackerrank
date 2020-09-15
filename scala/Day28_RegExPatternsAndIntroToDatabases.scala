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

        val N = stdin.readLine.trim.toInt
        val name_list = new scala.collection.mutable.ArrayBuffer[String]()

        for (NItr <- 1 to N) {
            val firstNameEmailID = stdin.readLine.split(" ")
            val firstName = firstNameEmailID(0)
            val emailID = firstNameEmailID(1)

            val email_check = "[a-z.]+@gmail.com".r
            
            if ((email_check findFirstIn emailID) != None)
                name_list += firstName
        }

        for ( i <- name_list.sorted ) 
            println(i)

    }
}

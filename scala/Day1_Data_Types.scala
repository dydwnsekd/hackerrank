object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val input_i = scala.io.StdIn.readInt()
        val input_d = scala.io.StdIn.readDouble()
        val input_s = scala.io.StdIn.readLine()
        
        // Print the sum of both the integer variables
        println(i + input_i)
        
        // Print the sum of both the double variables
        println(d + input_d)
        
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + input_s)
    }
}
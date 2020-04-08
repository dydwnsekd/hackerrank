// https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

object Solution extends App {
    def f(n: Int) {
        for (i <- 0 until n) {
            println("Hello World")
        }
    }

/* best
object Solution extends App {
    def f(n: Int) = println("Hello World\n" * n)
}
*/
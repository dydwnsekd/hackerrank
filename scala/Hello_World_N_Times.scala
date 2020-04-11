// https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

object Solution extends App {
    def f(n: Int) {
        for (i <- 0 until n) {
            println("Hello World")
        }
    }

/* best
object Solution extends App {
    // scala에서는 문자열에 * 기호를 사용할 수 있어 해당 횟수만큼 반복
    // 익명 함수를 선언하여 input 값에 따라 Hello World를 input값 만큼 반복
    def f(n: Int) = println("Hello World\n" * n)
}
*/
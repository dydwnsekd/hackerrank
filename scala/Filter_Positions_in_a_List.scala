//https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem


def f(arr:List[Int]):List[Int] = {
    arr.zipWithIndex.filter(_._2 % 2 == 1).unzip._1

    // _1 = value만 나옴 _2 = index만 나옴
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

}
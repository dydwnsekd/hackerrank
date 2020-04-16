// https://www.hackerrank.com/challenges/fp-filter-array/problem

def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)

/* best
 def f(delim:Int,arr:List[Int]):List[Int] = for (i <- arr if i < delim) yield i
 /*
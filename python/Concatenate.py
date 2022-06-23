import numpy as np
import sys

n, m, p = map(int, sys.stdin.readline().split())
np_arr1 = np.array([sys.stdin.readline().split() for _ in range(n)], int)
np_arr2 = np.array([sys.stdin.readline().split() for _ in range(m)], int)

print(np.concatenate((np_arr1, np_arr2), axis = 0))
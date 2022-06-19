import numpy as np
import sys

n, m, p = list(map(int, sys.stdin.readline().split()))

print(np.zeros((n,m,p), dtype = np.int32))
print(np.ones((n,m,p), dtype = np.int32))
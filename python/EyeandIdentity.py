import numpy as np

n, m = list(map(int, input().split()))

np.set_printoptions(sign=' ')
print (np.eye(n, m))
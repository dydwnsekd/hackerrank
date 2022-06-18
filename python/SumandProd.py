import numpy as np
import sys

n, m = list(map(int, sys.stdin.readline().split()))
np_array = np.empty((0, m), int)

for i in range(n):
    temp_list = []
    temp_list.append(list(map(int, sys.stdin.readline().split())))
    np_array = np.append(np_array, np.array(temp_list), axis=0)
    
print (np.prod(np.sum(np_array, axis = 0)))
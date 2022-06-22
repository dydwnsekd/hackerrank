import numpy as np

np_arr = np.array(list(input().split()), int)
np_arr = np.reshape(np_arr, (3, 3))

print(np_arr)
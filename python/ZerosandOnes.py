import numpy as np
import sys

nums = list(map(int, sys.stdin.readline().split()))

print(np.zeros(nums, dtype=np.int32))
print(np.ones(nums, dtype=np.int32))

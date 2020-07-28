#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the countTriplets function below.
def countTriplets(arr, r):
    arr_counter = Counter(arr)
    past_counter = Counter()
    s = 0
    for i in arr:
        j = i//r
        k = i*r
        arr_counter[i]-=1
        if past_counter[j] and arr_counter[k] and not i%r:
            s+=past_counter[j]*arr_counter[k]
        past_counter[i]+=1
    return s


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()

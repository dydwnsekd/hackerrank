#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# 참고
# https://www.thepoorcoder.com/hackerrank-count-triplets-solution/

# Complete the countTriplets function below.
def countTriplets(arr, r):
    arr_dict = Counter(r)

    for i in arr:
        if i % r == 0:
            pass

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()

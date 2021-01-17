#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the cutTheSticks function below.
def cutTheSticks(arr):
    result_count = [len(arr)]
    count = len(arr)
    set_arr = sorted(set(arr))
    for i in set_arr[:-1]:
        result_count.append(count - arr.count(i))
        count -= arr.count(i)
        
    return result_count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = cutTheSticks(arr)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

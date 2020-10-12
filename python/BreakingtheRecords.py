#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the breakingRecords function below.
def breakingRecords(scores):
    max_count = 0
    min_count = 0

    max_value = scores[0]
    min_value = scores[0]

    for i in scores[1:]:
        if max_value < i:
            max_value = i
            max_count += 1
        if min_value > i:
            min_value = i
            min_count += 1
    
    return max_count, min_count
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    scores = list(map(int, input().rstrip().split()))

    result = breakingRecords(scores)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

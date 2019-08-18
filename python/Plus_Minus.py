#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(arr):
    plus_count = 0
    zero_count = 0
    minus_count = 0

    for i in arr:
        if i > 0:
            plus_count += 1
        elif i == 0:
            zero_count += 1
        else:
            minus_count += 1

    print ("%0.7f" % (plus_count/len(arr)))
    print ("%0.7f" % (minus_count/len(arr)))
    print ("%0.7f" % (zero_count/len(arr)))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)

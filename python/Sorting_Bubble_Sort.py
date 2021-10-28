#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countSwaps' function below.
#
# The function accepts INTEGER_ARRAY a as parameter.
#

def countSwaps(a):
    count = 0
    for i in range(len(a)-1):
        for j in range(i, len(a)):
            if a[i] > a[j]:
                temp = a[i]
                a[i] = a[j]
                a[j] = temp
                count += 1
                
    print("""Array is sorted in {count} swaps.
First Element: {min}
Last Element: {max}""".format(count=count, min=a[0], max=a[-1])
    )
                
            

if __name__ == '__main__':
    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    countSwaps(a)

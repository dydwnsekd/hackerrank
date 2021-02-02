#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the chocolateFeast function below.
def chocolateFeast(n, c, m):
    eat_count = n / c
    wrappers_count = n / c
    
    while wrappers_count > m:
        temp_count = wrappers_count // m
        wrappers_count = wrappers_count - (temp_count * m) + temp_count
        eat_count += temp_count
        print(wrappers_count)
        
    return eat_count
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        ncm = input().split()

        n = int(ncm[0])

        c = int(ncm[1])

        m = int(ncm[2])

        result = chocolateFeast(n, c, m)

        fptr.write(str(result) + '\n')

    fptr.close()

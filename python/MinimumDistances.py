#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumDistances function below.
def minimumDistances(a):
    reverse_a = a.copy()
    reverse_a.reverse()
    distances = []
    
    for i in a:
        front_index = a.index(i)
        back_index = reverse_a.index(i)
        
        if front_index != len(a) - back_index - 1:
            distances.append((len(a) - back_index - 1) - front_index)
            
    if len(distances) == 0:
        return -1
    else:
        return min(distances)
        
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    a = list(map(int, input().rstrip().split()))

    result = minimumDistances(a)

    fptr.write(str(result) + '\n')

    fptr.close()

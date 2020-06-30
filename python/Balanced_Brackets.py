#!/bin/python3
# https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    split_s = []
    for i in s:
        if i in ['{', '(', '[']:
            split_s.append(i)
        else:
            if len(split_s) == 0:
                return 'NO'
            temp_str = split_s.pop()
            if temp_str == '{' and i == '}': pass
            elif temp_str == '[' and i == ']': pass
            elif temp_str == '(' and i == ')': pass
            else:
                return 'NO'
    
    if len(split_s) > 0:
        return 'NO'
    return 'YES'

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)

        fptr.write(result + '\n')

    fptr.close()

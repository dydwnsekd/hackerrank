#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    split_s = []
    match_bracket = ['()', '[]', '{}']
    for i in s:
        if i in ['{', '(', '[']:
            split_s.append(i)
        elif len(split_s) == 0 or split_s.pop() + i not in match_bracket:
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

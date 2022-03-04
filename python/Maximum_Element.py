#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'getMax' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts STRING_ARRAY operations as parameter.
#

def getMax(operations):
    stack = []
    max_value = -99999
    result_list = []
    for op in operations:
        if op[0] == '1':
            value = int(op[2:])
            stack.append(value)
            if value > max_value:
                max_value = value
        elif op[0] == '2':
            pop_value = stack.pop()
            if pop_value == max_value and len(stack) > 0:
                max_value = max(stack)
            elif len(stack) == 0:
                max_value = -99999
        else:
            result_list.append(max_value)
            
    return result_list

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    ops = []

    for _ in range(n):
        ops_item = input()
        ops.append(ops_item)

    res = getMax(ops)

    fptr.write('\n'.join(map(str, res)))
    fptr.write('\n')

    fptr.close()

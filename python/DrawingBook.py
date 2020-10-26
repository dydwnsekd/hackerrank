#!/bin/python3

import os
import sys

#
# Complete the pageCount function below.
#
def pageCount(n, p):
    total_page = int(n/2)
    need_page = int(p/2)

    if total_page - need_page < need_page:
        return total_page - need_page
    else:
        return need_page

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    p = int(input())

    result = pageCount(n, p)

    fptr.write(str(result) + '\n')

    fptr.close()


os.mkdir()
#!/bin/python3

import math
import os
import random
import re
import sys
from datetime import datetime, timedelta

# Complete the time_delta function below.
def time_delta(t1, t2):
    dateformat = '%a %d %b %Y %H:%M:%S %z'
    return str(abs(int((datetime.strptime(t1, dateformat) - datetime.strptime(t2, dateformat)).total_seconds())))
    
    return 0

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()

        t2 = input()

        delta = time_delta(t1, t2)

        fptr.write(delta + '\n')

    fptr.close()

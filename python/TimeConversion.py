#!/bin/python3

import os
import sys

def timeConversion(t):
    h, m, s = t[:-2].split(":")
    if t[-2:] == "PM" and h != "12":
        h = int(h) + 12
    elif t[-2:] == "AM" and h == "12":
        h = "00"
    return (str(h)+":"+m+":"+s)

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    t = input()

    result = timeConversion(t)

    f.write(result + '\n')

    f.close()

import sys
import re

n = int(sys.stdin.readline())

p = re.compile("[+-]?[0-9]*\.[0-9]+$")

for _ in range(n):
    t = sys.stdin.readline()
    if p.match(t):
        print("True")
    else:
        print("False")
    
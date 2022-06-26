import sys
import re

n = int(sys.stdin.readline())
p = re.compile("[a-zA-Z0-9]{10}")


for _ in range(n):
    t = sys.stdin.readline()
    if p.match(t) and len(set(t)) == len(t):
        print("Valid")
    else:
        print("Invalid")

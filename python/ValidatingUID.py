import sys
import re

n = int(sys.stdin.readline())
p = re.compile("[a-zA-Z0-9]{10}")
alpha = re.compile("[A-Z]")
num = re.compile("[0-9]")

for _ in range(n):
    t = sys.stdin.readline()
    if p.match(t) and len(set(t)) == len(t) and len(alpha.findall(t)) >= 2 and len(num.findall(t)) >= 3:
        print("Valid")
    else:
        print("Invalid")

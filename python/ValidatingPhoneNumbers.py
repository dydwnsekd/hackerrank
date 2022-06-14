import re
import sys

n = int(sys.stdin.readline())
p = re.compile("^[789][0-9]{9}$")

for _ in range(n):
    t = sys.stdin.readline()
    if p.match(t):
        print("YES")
    else:
        print("NO")
    

import re

s = input()
str_p = input()

p = re.compile(str_p)
r = p.search(s)

if not r:
    print("(-1, -1)")

while r:
    print("({start}, {end})".format(start=r.start(), end=r.end()-1))
    r = p.search(s, r.start()+1)
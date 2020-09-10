import sys

d1, m1, y1 = list(map(int, sys.stdin.readline().split(" ")))
d2, m2, y2 = list(map(int, sys.stdin.readline().split(" ")))

if y1 > y2:
    print(10000)
elif y1 == y2:
    if m1 > m2:
        print ((m1-m2) * 500)
    elif m1 == m2:
        if d1 > d2:
            print ((d1-d2) * 15)
        else:
            print (0)
    else:
        print (0)
else:
    print (0)
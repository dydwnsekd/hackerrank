from collections import defaultdict
d = defaultdict(list)

n,m = map(int, input().split())

for i in range(n):
    d[input()].append(i+1)
    
for i in range(m):
    k = input()
    
    if d[k]:
        print(*d[k], sep=' ')
    else:
        print(-1)
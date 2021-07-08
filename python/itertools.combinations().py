from itertools import combinations

str, n = input().split()

str = sorted(str)

for i in range(1,int(n)+1):
    print(*[''.join(j) for j in combinations(str, i)], sep='\n')
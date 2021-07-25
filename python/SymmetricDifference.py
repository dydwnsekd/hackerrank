n = int(input())
set_a = set()
set_a.update(list(map(int, input().split())))

m = int(input())
set_b = set()
set_b.update(list(map(int, input().split())))

for i in sorted(set_a.difference(set_b).union(set_b.difference(set_a))):
    print(i)

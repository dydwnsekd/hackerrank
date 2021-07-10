input()
set_a = set(list(map(int, input().split())))

input()
set_b = set(list(map(int, input().split())))

print(len(set_a.difference(set_b)))
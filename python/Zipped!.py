n, m = map(int, input().split())

result = []

for i in range(m):
    result.append(list(map(float, input().split())))
    
for i in zip(*result):
    print(sum(i) / len(i))
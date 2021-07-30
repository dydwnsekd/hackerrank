n, m = list(input().split())

if int(m) == eval(input().replace('x', n)):
    print(True)
else:
    print(False)
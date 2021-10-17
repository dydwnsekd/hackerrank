input()
num_list = list(input().split())

if all([int(i) > 0 for i in num_list]) and any(i[::-1] == i for i in num_list):
    print(True)
else:
    print(False)
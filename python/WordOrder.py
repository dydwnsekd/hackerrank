from collections import OrderedDict

n = int(input())
str_list = []
str_dict = OrderedDict()

for _ in range(n):
    input_str = input()
    str_list.append(input_str)
    str_dict[input_str] = str_dict.get(input_str, 0) + 1
    
print(len(set(str_list)))

print(*str_dict.values(), sep=" ")
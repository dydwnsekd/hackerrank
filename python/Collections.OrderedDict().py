from collections import OrderedDict

n=int(input())
ordered_dictionary = OrderedDict()

for _ in range(n):
    item, space, value = input().rpartition(" ")    
    ordered_dictionary[item] = ordered_dictionary.get(item, 0) + int(value)
    
for key, value in ordered_dictionary.items():
    print(key, value)
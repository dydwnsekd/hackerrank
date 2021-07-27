from collections import Counter

shoe_dict = {}
income = 0

input()
shoe_size = Counter(list(map(int, input().split(" "))))
order_count = int(input())

# for i in range(0, len(shoe_size_quantity), 2):
#     shoe_dict[shoe_size_quantity[i]] = shoe_size_quantity[i+1]
    
for _ in range(order_count):
    size, dollor = map(int, input().split(" "))
    if size in shoe_size and shoe_size[size] > 0:
        income += dollor
        shoe_size[size] -= 1
        
print(income)
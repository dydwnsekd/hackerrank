import re

s = input()
find_s = re.findall(r'[AEIOUaeiou]{2,}',s)

if find_s:
    for i in find_s:
        print(i)
else:
    print(-1)
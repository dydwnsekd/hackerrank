import itertools

text = input()
compress_str = []

for k, g in itertools.groupby(text):
    compress_str.append((len(list(g)), int(k)))
    
print(*compress_str)
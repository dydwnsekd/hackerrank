def print_rangoli(size):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'[0:size]
    
    for i in range(size-1, -size, -1):
        x = abs(i)
        if x >= 0:
            line = alphabet[size:x:-1]+alphabet[x:size]
            print ("--"*x+ '-'.join(line)+"--"*x)

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
def swap_case(s):
    return_s = ""
    for i in s:
        if 97 <= ord(i) <= 122:
            return_s += (chr(ord(i)-32))
        elif 65 <= ord(i) <= 90:
            return_s += (chr(ord(i)+32))
        else:
            return_s += (i)
        
    return return_s
    # return s.swapcase()

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
def merge_the_tools(string, k):
    
    for i in range(0, len(string), k):
        temp = []
        s = string[i:i+k]
        for j in s:
            if j not in temp:
                temp.append(j)
                
        print("".join(temp))
        

if __name__ == '__main__':
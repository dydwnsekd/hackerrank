def getGCD(num1, num2):
    r = -1
    if num1 < num2: num1, num2 = num2, num1

    while (r!=0):
        r = num1 % num2
        num1, num2 = num2, r

    return(num1)
    
def getLCM(num1, num2):
    return int((num1 * num2) / getGCD(num1, num2))

print(getGCD(4,10))
print(getLCM(4,10))
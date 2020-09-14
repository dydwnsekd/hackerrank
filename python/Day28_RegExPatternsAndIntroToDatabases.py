#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    N = int(input())
    name_list = []

    for N_itr in range(N):
        firstNameEmailID = input().split()
        firstName = firstNameEmailID[0]
        emailID = firstNameEmailID[1]

        email_check = re.compile('[a-z.]+@gmail.com')

        if email_check.match(emailID):
            name_list.append(firstName)
        
    name_list.sort()

    for i in name_list:
        print(i)
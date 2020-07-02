#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the luckBalance function below.
def luckBalance(k, contests):
    important = k
    balance = 0
    
    contests = sorted(contests, key = lambda x: x[0], reverse = True)
    for c in contests:
        if c[1] == 0:
            balance += c[0]
            print("losing unimp")
            print(balance)
            
        if c[1] == 1 and important > 0:
            print("losing imp")
            balance += c[0]
            print(balance)
            important -=1
        elif important == 0 and c[1] == 1:
            print("winning imp")
            balance -= c[0]
            print(balance)
    return balance





if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    contests = []

    for _ in range(n):
        contests.append(list(map(int, input().rstrip().split())))

    result = luckBalance(k, contests)

    fptr.write(str(result) + '\n')

    fptr.close()

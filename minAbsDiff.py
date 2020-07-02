#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumAbsoluteDifference function below.
def minimumAbsoluteDifference(arr):
    val = 100000000
    arr = sorted(arr)
    for i in range(len(arr) - 1):
        if abs(arr[i]-arr[i+1]) < val :
            val = abs(arr[i] - arr[i+1])
        if val == 0:
            return val

        

    return val


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = minimumAbsoluteDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()

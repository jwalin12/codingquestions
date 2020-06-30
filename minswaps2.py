
import math
import os
import random
import re
import sys

# Complete the minimumSwaps function below.
def minimumSwaps(arr):
    swap = 0
    norm = min(arr) - 1
    if norm !=0:
        for k in arr:
            k -= norm
    visited = [False for i in range(len(arr))]
    arr_pos = [*enumerate(arr)]
    print(arr_pos)
    arr_pos = sorted(arr_pos,key = lambda x: x[1])
    print(arr_pos)
    for j in range(len(arr)):
        if visited[j] or arr_pos[j][0] == j +1:
            continue
        cycle_len = 0
        n=j
        while not visited[n]:
            visited[n] = True
            n = arr_pos[n][0]
            cycle_len +=1
        if cycle_len > 0:
            print(cycle_len)
            swap += cycle_len - 1
        
    return swap


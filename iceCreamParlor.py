#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the whatFlavors function below.
def whatFlavors(cost, money):
    val_to_index = {}

    for i in range(len(cost)):
        if val_to_index.get(cost[i], -1) != -1:
            val_to_index[cost[i]] = [val_to_index[cost[i]], i]
        else:
            val_to_index[cost[i]] = i
    cost = sorted(cost)
    for c in cost:
        targ = money - c
        if targ in val_to_index.keys():
            if type(val_to_index[targ]) == int:
                output = [val_to_index[targ], val_to_index[c]]
                print(min(output) + 1, max(output) + 1)
                return
            else:
                print(val_to_index[targ][0] + 1, val_to_index[targ][1] + 1)
                return
                

if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        money = int(input())

        n = int(input())

        cost = list(map(int, input().rstrip().split()))

        whatFlavors(cost, money)

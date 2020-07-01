#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the activityNotifications function below.
def activityNotifications(expenditure, d):
    notifs = 0
    count_sort_list = [0]*(max(expenditure)+1)
    for i in range(0,d):
        count_sort_list[expenditure[i]] +=1
    if d%2==0:
        med_position = d//2 + 1
    else:
        med_position = d/2
    while d < len(expenditure):
        median = getMedian(count_sort_list, d, med_position)
        if expenditure[d] >= 2*median:
            notifs +=1
        count_sort_list[expenditure[0]] -=1
        count_sort_list[expenditure[d]] +=1
        expenditure = expenditure[1:]
    return notifs

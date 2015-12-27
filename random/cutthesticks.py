#!/bin/python

import sys
n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
print n
temp = n
while  temp > 1:
    val = min (arr)
    arr = filter(lambda x: x-val > 0,arr)
    temp = len(arr)
    if temp > 0:
    	print temp
    else: break
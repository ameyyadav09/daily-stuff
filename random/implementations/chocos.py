#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n,c,m = raw_input().strip().split(' ')
    n,c,m = [int(n),int(c),int(m)]
    temp = n / c
    chocos = temp
    while temp >= m:
    	val = (temp/m)
    	chocos += val
    	temp = temp - (m*val) + val
    print chocos
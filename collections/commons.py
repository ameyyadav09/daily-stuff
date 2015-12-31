#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    count = 0
    for each in str(n):
        if each != '0':
            if n % int(each):
                count += 1
    print count
#!/bin/python

import sys

t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    x = n
    while x > 0:
        if x % 3:
            x -= 5
        else:
            break
    if x >= 0:
        print '5'*x+(n-x)*'3'
    else:
        print -1
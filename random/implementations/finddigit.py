#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    print len([i for i in str(n) if int(i) > 0 if n%int(i) == 0])
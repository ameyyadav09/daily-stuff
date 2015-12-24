#!/bin/python

import sys
from fractions import gcd

A,B,C,D = raw_input().strip().split(' ')
A,B,C,D = [int(A),int(B),int(C),int(D)]
appartments = [[A,B,C,D] for A in range(1,A+1) for B in range(1,B+1) for C in range(1,C+1) for D in range(1,D+1)]
ghosts = []
for appartment in appartments:
	if abs(appartment[0]-appartment[1])%3 == 0:
		if (appartment[1]+appartment[2])%5 == 0:
			if (appartment[0]*appartment[2])%4 == 0:
				if gcd(appartment[0],appartment[3]) == 1:
					ghosts.append(appartment)
print len(ghosts)


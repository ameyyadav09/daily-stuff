#!/bin/python

import sys
import math

K,N = raw_input().strip().split(' ')
K,N = [int(K),int(N)]
R = map(int,raw_input().strip().split(' '))
list1 = []
for i in range(N):
	temp = map(int,raw_input().strip().split(' '))
	val = math.sqrt((temp[0]*temp[0])+(temp[1]*temp[1]))
	list1.append(val)
sum = 0
for each in list1:
	for r in range(1,K+1):
		if each <= R[-r]:
			sum  = sum + R.index(R[-r])+1
			break

print sum	
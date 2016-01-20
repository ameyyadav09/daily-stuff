#!/bin/python

import sys
import os

# Complete the function below.
def  kSub( k,  nums):
	count = 0
	for i in range(len(nums)):
		# s = str(nums[i])
		s = ""
		for j in range(i,len(nums)):
			s = s + str(nums[j])
			if int(s)%k==0:
				# print s
				count += 1
	return count

_k = int(raw_input());
_nums_cnt = int(raw_input())
_nums_i=0
_nums = map(int,raw_input().split())
# while _nums_i < _nums_cnt:
#     _nums_item = int(raw_input());
#     _nums.append(_nums_item)
#     _nums_i+=1
    

res = kSub(_k, _nums);
print res
# f.write(str(res) + "\n")

# f.close()
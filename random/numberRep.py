# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys
N = int(input())
lis = map(int,raw_input().split())
count = i = 0
for i in range(len(lis)-1):
	if lis[i+1] <= lis[i]:
		lis[i+1] = lis[i]+1
		count += 1
print count

# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import defaultdict
def method(dic, val):
	if val in dic.keys():
		for each in dic[val]:
			print each,
		print
	else:
		print -1
n,m = map(int,raw_input().split())
A = defaultdict(list)
for i in range(1,n+m+1):
    if i <= n:
        A[raw_input()].append(i)
    else:
        method(A,raw_input())
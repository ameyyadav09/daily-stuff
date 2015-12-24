# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(raw_input())
A = set(map(int,raw_input().split()))
N = int(raw_input())
for i in range(N):
	print A
	lis = raw_input().split()
	temp = set(map(int,raw_input().split()))
	if lis[0] == "intersection_update":
	    A.intersection_update(temp)
	elif lis[0] == "symmetric_difference_update":
	    A.symmetric_difference_update(temp)
	elif lis[0] == "difference_update":
	    A.difference_update(temp)
	elif lis[0] == "update":
	    A.update(temp)
print sum(A)
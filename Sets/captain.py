# Enter your code here. Read input from STDIN. Print output to STDOUT
K = int(raw_input())
lis = map(int,raw_input().split())
# lis = sorted(lis)
print lis
s = set(lis)
n = len(lis)-1
rev = lis[::-1]
for x in s:
	if lis.index(x) == n-(rev.index(x)):
		print x
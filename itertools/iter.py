# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations
N = int(raw_input())
lis = raw_input().split()
K = int(raw_input())
al = 0
count = 0
for each in combinations(lis,K):
	print each
	if 'a' in each:
		count += 1
	al += 1
print count , al
print ("%.3f"% (float(count)/al))  
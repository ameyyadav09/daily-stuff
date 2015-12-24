# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations
lis = raw_input().split()
strin = lis[0]
K = int(lis[1])
lis = []
for each in permutations(strin, K):
    lis.append(''.join(each))
for each in sorted(lis):
	print each
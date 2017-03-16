# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations
strin = raw_input()
K = len(strin)
lis = []
for each in permutations(strin, K):
    lis.append(''.join(each))
for each in sorted(lis):
	print each
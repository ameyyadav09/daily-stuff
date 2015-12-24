# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations_with_replacement
lis = raw_input().split()
strin = sorted(lis[0])
K = int(lis[1])
for each in combinations_with_replacement(strin,K):
    print ''.join(each)
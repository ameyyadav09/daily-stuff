def combos(S,n):
    if (n <= 0): return
    for s in S:
		if len(s) <= n: yield s
		for t in combos(S,n-len(s)): 
			yield s+t
N = int(raw_input())
s = raw_input()
lis = []
for each in s:
	lis.append(each)
print [x for x in combos(lis,N) if len(x) == N]
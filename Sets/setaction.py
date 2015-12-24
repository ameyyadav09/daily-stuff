n = int(raw_input())
s = set(map(int, raw_input().split()))
N = int(raw_input())
for i in range(N):
	lis = []
	lis = raw_input().split()
	if lis[0] == "remove":
		print "hehe"
		s.remove(int(lis[1]))
	elif lis[0] == "discard":
		s.discard(int(lis[1]))
	elif lis[0] == "pop":
		s.pop()
print sum(s)
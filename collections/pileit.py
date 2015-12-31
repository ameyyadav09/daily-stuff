# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque
for i in range(int(raw_input())):
	n = int(raw_input())
	d = deque(map(int,raw_input().strip().split()))
	top = 0
	flag = True
	for j in range(n):
		# val = max(d[0],d[-1])
		if d[0] >= d[-1]:
			val = d.popleft()
		elif d[-1] >= d[0]:
			val = d.pop()
		if top == 0:
			top = val
		elif val <= top:
			val = top
		else:
			flag = False
			break
	if flag == True:
		print "YES"
	else:
		print "NO"
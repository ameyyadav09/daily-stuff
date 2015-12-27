size = int(raw_input())
servers = map(int, raw_input().split())
sm = 0
tempSize = size
for i in range(size):
	if servers[0] > servers[tempSize - 1]:
		sm += servers[0] * (i + 1)
		del servers[0]
		tempSize -= 1
	else:
		sm += servers[tempSize - 1] * (i + 1)
		del servers[tempSize - 1]
		tempSize -= 1
print sm

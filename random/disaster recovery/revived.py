n = int(raw_input())
servers = map(int, raw_input().split())
server = servers[0:]
su = 0
turn = 1
lissize = n-1
for i in range(n):
	index = servers.index(max(servers))
	if index < (n/2):
		# print servers[0]
		su += servers[0] * (i+1)
		del servers[0]
		lissize -= 1
	else:
		# print servers[lissize]
		su += servers[lissize] * (i+1)
		del servers[lissize]
		lissize -= 1
lissize = n- 1
sm = 0
for i in range(n):
	if server[0] > server[lissize]:
		sm += server[0] * (i + 1)
		del server[0]
		lissize -= 1
	else:
		sm += server[lissize] * (i + 1)
		del server[lissize]
		lissize -= 1
print min ( su , sm)
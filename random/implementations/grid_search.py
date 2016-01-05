def method(a,gi,gj,pi,pj):
	h = gi+pi
	v = gj + pj
	l = []
	for i in range(gi,h):
		# for j in range(gj,v):
		l.append(a[i][gj:v])
	return l 


for tests in range(int(raw_input())):
	gridi,gridj = map(int,raw_input().strip().split(' '))
	grid = []
	for each in range(gridi):
		grid.insert(each, str(raw_input().strip()))
	pi,pj = map(int,raw_input().strip().split(' '))
	pattern = []
	for each in range(pi):
		pattern.insert(each, str(raw_input().strip()))
	flag = False
	for i in range(gridi-pi+1):
		for j in range(gridj-pj+1):
			print grid[i][j:j+pj]
			if pattern[0] == grid[i][j:j+pj]:
				d = method(grid,i,j,pi,pj)
				if d == pattern:
					flag = True
					break
		if flag == True:
			break
	if flag == True:
		print "YES"
	else:
		print "NO"

	# print grid
	# print pattern
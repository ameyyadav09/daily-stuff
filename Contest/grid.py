n, m = int(raw_input()), int(raw_input())
array = [[0 for x in range(n)] for y in range(m)]
for x in xrange(n):
	array[0][x] = 1
	array[x][0] = 1
array[0][0] = 0
for x in xrange(1,n):
	for j in xrange(1,n):
		array[x][j] = array[x-1][j] + array[x][j-1]
for x in xrange(0,n):
	for j in xrange(0,n):
		print array[x][j],
	print
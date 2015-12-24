N = int(raw_input())
for i in range(1,N+1):
	print "{0:{w}d} {0:{w}o} {0:{w}X} {0:{w}b}".format(i, w=len("{0:b}".format(N)))
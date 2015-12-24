from itertools import groupby
strin = raw_input()
for each,i in groupby(strin):
	print "(%d, %s) "%(len(list(i)),each),
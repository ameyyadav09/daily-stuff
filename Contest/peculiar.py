import sys
n = int(raw_input())
try:
	var = map(lambda x: False,range(n+1))
	i = 1
	for i in range(1,n+1,i):
		i = i*i
		if i < n+1:
			var[i] = True
	for i in range(1,n+1):
		if var[i]:
			print "Yes",
		else:
			print "No",
# for i in range(1,n+1):
# 	count_inc = i
# 	for j in range(i,n+1,count_inc):
# 		if var[j]:
# 			var[j] = False
# 		elif var[j] == False:
# 			var[j] = True
# for i in range(1,n+1):
# 	if var[i]:
# 		print "Yes",
# 	else:
# 		print "No",
except Exception:
	print "Not Possible"
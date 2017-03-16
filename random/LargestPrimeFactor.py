# Enter your code here. Read input from STDIN. Print output to STDOUT
def ifPrime(val):
	if val > 3:
	    for each in xrange(1,val):
	        if each > 1:
		        pro = each * each
		        if pro > val:
		            break
		        if val%each == 0:
		        	return False
	return True

print ifPrime(91)
# n = int(raw_input())
# for each in xrange(n):
# 	N = int(raw_input())
# 	max_val = N
# 	if not ifPrime(N):
# 		for i in xrange(2,N):
# 			if i > 1:
# 				if ifPrime(i):
# 					if N%i == 0:
# 						max_val = i
# 			i = i+1
# 	else:
# 		max_val = N
# 	print max_val
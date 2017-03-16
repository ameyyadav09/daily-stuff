n = p = 0
def gcd(a, b):
	while a and b:
		if a > b:
			a%=b
		else:
			b%=a
	return a+b

ip = int(raw_input())
while(ip > 0):
	a,b,c=map(int, raw_input().split())
	temp = gcd(a, b)
	# a/=temp
	# b/=temp
	# c/=temp
	# x = 1
	# y = 0
	# print a,b,c
	# while True:
	# 	y = (1 - (a * x))/float(b);
	# 	if y == int(y):
	# 		break
	# 	x = x + 1

	# print x, int(y)
	# print (x*c), int(y*c)
	print n, p, temp
	ip-=1
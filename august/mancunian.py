'''
# Read input from stdin and provide input before running code

name = raw_input('What is your name?\n')
print 'Hi, %s.' % name

Program to check the naughty numbers i.e a number who total prime factors should be equal to number of digits in that number
say, 1,2,3,4,5,7,8,9,10,12,14....

20
2 50
60 120
90 150
200 1000
500 1500
6000 7000
8000 9000
10000 11000
12000 13000
15000 16000
20000 30000
1 40000
50000 60000
70000 80000
90000 100000
1 100000
99000 100000
90000 95000
65000 100000
15000 90000
'''
# checking if a number is prime or not
def isPrime(num):
	a = 0
	sqrt = int(num**(.5))
	for i in xrange(3, sqrt+1, 2):
		if num%i==0:
			return False
	return True
	
# calculating the prime factors
def primeCount(num):
	res = set ()
	while num%2==0:
		res.add(2)
		num = num//2
		
	sqrt = int(num**(.5))
	for i in xrange(3,sqrt+1,2):
		while num%i == 0:
			res.add(i)
			num = num//i
	if num>2:
		res.add(num)
	return res
			
	
	
q = int(raw_input())
lis = [0 for i in xrange(100001)]
lis[1] = 1
# calculating the naughty number till each number
for each in xrange(2,100001):
	if each%2==0 or not isPrime(each):
		val = len(primeCount(each))
		string = str(each)
		if val == len(string):
			lis[each] = lis[each-1]+1
		else:
			lis[each] = lis[each-1]
	else:
		if each < 10:
			lis[each] = lis[each-1]+1
		else:
			lis[each] = lis[each-1]
while q:
	a,b = map(int,raw_input().split())
	# printing out the number of naughty numbers in between two numbers
	count = lis[b] - lis[a-1]
	print count
	q-=1
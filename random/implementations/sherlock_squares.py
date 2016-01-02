from math import sqrt
from math import floor
for i in range(int(raw_input())):
	a,b = map(int,raw_input().split())
	print int(floor(sqrt(b)-sqrt(a))+1)
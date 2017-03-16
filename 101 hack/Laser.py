n = int(raw_input())
hei = map(int, raw_input().split())
q = int(raw_input())
laser = map(int, raw_input().split())
# laser.sort()

left = 0;
# index = 1
for each in laser:
	for i in xrange(1, each):
		val = hei[i-1]-(each-i)
		if val > 0:
			hei[i-1] = each-i
	# index = each

for each in hei:
	left+=each
print left
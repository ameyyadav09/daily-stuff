#http://www.geeksforgeeks.org/find-two-rectangles-overlap/


#http://www.geeksforgeeks.org/how-to-check-if-a-given-point-lies-inside-a-polygon/
# additional info

class point:
	def __init__(self, x,y):
		self.x = x
		self.y = y

def checkOverlap(h1, l1, h2, l2):
	#checking if reactangles are not beside one another
	if h1.x>l2.x or h2.x>l1.x:
		print "Do not OverLap"
		return
	#checking if ractangles are not above one another
	if h1.y<l2.y or h2.y<l1.y:
		print "Do not OverLap"
		return

	#if both the cases defined above fail we say they are over lapping
	print "OverLap"

#input topleft and bottom right vetices of both the rectangles
lis1 = map(int, raw_input().split())
lis2 = map(int, raw_input().split())

h1 = point(lis1[0], lis1[1])
l1 = point(lis1[2], lis1[3])
h2 = point(lis2[0], lis2[1])
l2 = point(lis2[2], lis2[3])

checkOverlap(h1, l1, h2, l2)
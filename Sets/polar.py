# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
import cmath
inp = raw_input().split('+')
x = int(inp[0])
y = int(inp[1][0])
print math.sqrt((x*x)+(y*y))
print cmath.phase(complex(x,y))

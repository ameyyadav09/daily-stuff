# Enter your code here. Read input from STDIN. Print output to STDOUT
#!/usr/local/bin/python
import os, sys
import math

a = int(raw_input())
b = int(raw_input())
print str(int(round(math.degrees(math.atan(1.0*a/b)))))+'°'
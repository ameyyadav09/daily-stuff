# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import namedtuple
N, Student= int(raw_input()),namedtuple('Student',raw_input().strip().split())
print (sum(int(Student(*raw_input().split()).MARKS) for i in range(N))/N)
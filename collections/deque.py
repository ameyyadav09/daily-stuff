# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque
d = deque()
tests = int(raw_input())
for i in range(tests):
    ip = raw_input().split(' ')
    if ip[0] == 'append':
        d.append(int(ip[1]))
    elif ip[0] == 'appendleft':
        d.appendleft(int(ip[1]))
    elif ip[0] == 'pop':
        print d.pop()
    elif ip[0] == 'popleft':
        print d.popleft()
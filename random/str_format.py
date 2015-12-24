# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
for i in range(1,N):
    print "%d%s%s"  % (i,oct(i),hex(i))
# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input())
list = []
for i in range(N):
    var = int(raw_input())
    if var%2 == 0:
        print "%d is even" % (var)
    else:
        print "%d is odd" % (var)
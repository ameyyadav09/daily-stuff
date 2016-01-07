# Enter your code here. Read input from STDIN. Print output to STDOUT
for i in range(int(raw_input())):
    n = int(raw_input())
    su,a,b = 0,0,2
    while b < n:
        su += b
        val = (4*b)+a
        a = b
        b = val
        # print b
    print su
        
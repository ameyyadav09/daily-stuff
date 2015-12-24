# Enter your code here. Read input from STDIN. Print output to STDOUT
M,N,Q = map(int,raw_input().split())
li = map(int,raw_input().split())
scene = [0]*map
for i in range(N):
    if scene[li[i]] == 0:
        scene[li[i]] = 1
    else:
        scene[li[i]] += 1
for i in range(Q):
    lis = map(int,raw_input().split())
    if len(lis) == 2:
        sum = 0
        for each in scene:
            if each < lis[1]:
                sum += 1
        print sum
    elif len(lis) == 3:
        scene[lis[2]] += 1
        scene[li[lis[1]]] -= 1
        li[lis[1]] = lis[2]
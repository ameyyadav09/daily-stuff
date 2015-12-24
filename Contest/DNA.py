# Enter your code here. Read input from STDIN. Print output to STDOUT
T = int(raw_input())
for i in range(T):
    N = int(raw_input())
    A = map(int,raw_input().split())
    B = map(int,raw_input().split())
    C = []
    flag = True
    for i in range(N):
        if i > 0:
            if A[i] >= C[i-1]:
                if B[i] >= C[i-1]:
                    C.append(min(A[i],B[i]))
                else:
                    C.append(A[i])
            elif B[i] >= C[i-1]:
                C.append(B[i])
            else:
                flag = False
                break
        elif i == 0:
            C.append(min(A[i],B[i]))
    if flag == True:
        print "YES"
    else:
        print "NO"
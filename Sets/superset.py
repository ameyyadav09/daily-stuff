A = set(map(int,raw_input().split()))
sub = set()
for i in range(int(raw_input())):
    sub.update(set(map(int,raw_input().split())))
print (A.intersection(sub) == sub and len(A) >= len(sub))
# Enter your code here. Read input from STDIN. Print output to STDOUT
def permutation(s):
   if len(s) == 1:
     return [s]

   perm_list = [] # resulting list
   for a in s:
     remaining_elements = [x for x in s if x != a]
     z = permutation(remaining_elements) # permutations of sublist

     for t in z:
       perm_list.append([a] + t)

   return perm_list

K,M = map(int,raw_input().split())
s = []
lis = []
for i in range(K):
	lis = map(int, raw_input().split())
	s.append(lis[1:])
perms = permutation(lis)
print perms
s = 0
for each in lis:
	temp = (sum(each))%M
	if temp > s:
		s = temp
print s
# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import OrderedDict
dic = OrderedDict()
for i in range(int(raw_input())):
    a,b,c = raw_input().rpartition(' ')
    dic[a] = dic.get(a,0) + int(c)
for each in dic:
    print each,dic[each]
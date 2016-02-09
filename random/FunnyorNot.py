# Enter your code here. Read input from STDIN. Print output to STDOUT
for each in range(int(raw_input())):
    str1 = raw_input().lower()
    str2 = str1[::-1]
    # print str2,str1
    flag = True
    for i in range(0,len(str1)-1):
        val1 = abs(ord(str2[i]) - ord(str2[i+1])) - 96
        val2 = abs(ord(str1[i]) - ord(str1[i+1])) - 96
        # print str2[i:i+2],str1[i:i+2]
        # print val1,val2
        if val1 != val2:
            flag = False
            break
    if flag:
        print "Funny"
    else:
        print "Not funny"
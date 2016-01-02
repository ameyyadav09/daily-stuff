# # Enter your code here. Read input from STDIN. Print output to STDOUT
# for i in range(int(raw_input())):
#     num = int(raw_input())
#     v1,v2 = (num-1)/3,(num-1)/5
#     v3 = (num-1)/15
#     s1 = (v1/2.0)*((2*3)+((v1-1)*3))
#     s2 = (v2/2.0)*((2*5)+((v2-1)*5))
#     s3 = (v3/2.0)*((2*15)+((v3-1)*15))
#     print int(s1+s2-s3)

# Enter your code here. Read input from STDIN. Print output to STDOUT
for i in range(int(raw_input())):
    num = int(raw_input())
    v1,v2 = (num-1)/3,(num-1)/5
    v3 = (num-1)/15
    s1 = ((6*v1)+(v1*(v1-1)*3))>>1
    s2 = ((10*v2)+(v2*(v2-1)*5))>>1
    s3 = ((30*v3)+(v3*(v3-1)*15))>>1
    print s1+s2-s3
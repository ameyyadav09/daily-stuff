# # Enter your code here. Read input from STDIN. Print output to STDOUT
# input_str = raw_input()
# input_str = input_str.split()
# output_str = ""
# for each in input_str:
#     if each.isalpha():
#         output_str = output_str + each[0].upper() + each[1:] + " "
#     else:
#     	output_str = output_str + each + " "

# print output_str
import re
input_str = raw_input()
g = lambda x:x.group(0).capitalize()
print (re.sub(r'\w+',g,input_str))
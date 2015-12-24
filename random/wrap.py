# Enter your code here. Read input from STDIN. Print output to STDOUT
import textwrap
input_str=raw_input()
num = int(raw_input())
list1 = textwrap.wrap(input_str, num)
for each in list1:
	print each
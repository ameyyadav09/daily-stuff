# Enter your code here. Read input from STDIN. Print output to STDOUT
str_input = raw_input()
list1 = []
list1.append(each.isalnum() for each in str_input)
list1.append(each.isalpha() for each in str_input)
list1.append(each.isdigit() for each in str_input)
list1.append(each.islower() for each in str_input)
list1.append(each.isupper() for each in str_input)

for i in range(len(list1)):
    print any(list1[i])
# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter
for each in sorted(Counter(raw_input()).most_common(3),key=lambda x: (-x[1],x[0])):
    print each[0],each[1]
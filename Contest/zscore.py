# Enter your code here. Read input from STDIN. Print output to STDOUT
from scipy.stats import norm
mean = 2000
sd = 200
Z = 1 - 0.10
per = norm.ppf(Z)
stdScore = (Z*sd) + mean
print "%.2f"%(stdScore)
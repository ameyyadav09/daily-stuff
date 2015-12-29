#!/bin/python
import sys
time = raw_input().strip()
hours = int(time[0:2])
print time
if time[-2:] == 'PM' and hours != 12:
	hours += 12
	time = str(hours) + time[2:]
elif time[-2:] == 'AM' and hours == 12:
	hours = '00'
	time = hours + time[2:]
print time[:-2]
    


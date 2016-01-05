#!/bin/python

import sys


n = int(raw_input().strip())
s = raw_input().strip()
k = int(raw_input().strip())
op = ""
for i in range(n):
    if 64<ord(s[i])<91:
        val = (ord(s[i]) - 65 + k)%26
        op += chr(val + 65)
    elif 96<ord(s[i])<123:
        val = (ord(s[i]) - 97 + k)%26
        op += chr(val + 97)
    else:
        op += s[i]
print op
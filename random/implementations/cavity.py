#!/bin/python

import sys
from collections import deque
n = int(raw_input().strip())
grid = []
grid_i = 0
for grid_i in xrange(n):
    grid_t = map(int, deque(raw_input().strip()))
    grid.append(grid_t)
i = 0
while i < n:
    j = 0
    temp = ""
    while j < n:
        if (0 < j < n-1) and (0 < i < n-1):
            if (grid[i-1][j] != 'X') and (grid[i+1][j] != 'X') and (grid[i][j-1] != 'X') and (grid [i][j+1] != 'X'):
                if (grid[i-1][j] < grid[i][j]) and (grid[i+1][j] < grid[i][j]) and (grid[i][j-1] < grid[i][j]) and (grid [i][j+1]  < grid[i][j]):
                    # grid[i][j] = 'X'
                    temp = temp + 'X'
                    j += 1
        temp = temp + str(grid[i][j])
        j += 1
    print temp
    # print grid[i]
    i += 1

class Solution(object):
    def deleteGreatestValue(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        for i in grid:
           i.sort()
        sum=0
        for i in range(len(grid[0])):
            mx=grid[0][i]
            for j in range(len(grid)):
               mx=max(mx,grid[j][i])
            sum+=mx
    
        return sum
            
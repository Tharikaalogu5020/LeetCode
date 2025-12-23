class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        rem=0
        ori=n
        while not n==0:
        
          rem=rem*10+n%10
          n//=10
        
        return abs(ori-rem)
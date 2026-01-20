class Solution(object):
    def vowelConsonantScore(self, s):
        """
        :type s: str
        :rtype: int
        """
        c=v=0
        for i in s:
            if i in "aeiou":
                v+=1
            elif i in "bcdfghjklmnpqrstvwxyz":
                c+=1
        return 0 if c==0 else int(math.floor(v/c))
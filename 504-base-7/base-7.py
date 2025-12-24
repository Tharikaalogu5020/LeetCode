class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num==0: return "0"
        neg=num<0
        num=abs(num)
        res=""
        while num!=0:
            res=str(num%7)+res
            num//=7
        return "-"+res if neg else res


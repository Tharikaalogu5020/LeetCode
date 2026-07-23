class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        nums=range(1,n+1)
        com=itertools.combinations(nums,k)
        result=[]
        for p in com:
            ans=list(p)
            result.append(ans)
        return result
        
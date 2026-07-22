class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        par=itertools.permutations(nums,len(nums))
        result=[]
        for p in par:
            lis=list(p)
            if lis not in result:
                result.append(lis)
        return result
        
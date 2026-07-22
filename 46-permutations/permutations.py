class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        par=itertools.permutations(nums,len(nums))
        result=[]
        for p in par:
            lis=list(p)
            result.append(lis)
        return result


        
        
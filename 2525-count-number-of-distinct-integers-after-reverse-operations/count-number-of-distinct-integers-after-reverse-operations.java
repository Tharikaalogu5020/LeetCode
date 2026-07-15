class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        
            
        int rev = 0;
        while(nums[i]>0){
            int digit = nums[i]%10;
            rev = rev*10+digit;
            nums[i] /= 10;
        }
            
            s.add(rev);
        }
       return s.size();
    }

    }

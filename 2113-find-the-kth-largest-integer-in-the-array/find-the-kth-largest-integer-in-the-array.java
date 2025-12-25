import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      Arrays.sort(nums,(a,b)->new BigInteger(a).compareTo(new BigInteger(b)));
        return nums[nums.length-k];
    }
}
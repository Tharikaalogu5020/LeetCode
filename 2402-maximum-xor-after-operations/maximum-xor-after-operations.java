class Solution {
    public int maximumXOR(int[] nums) {
        return Arrays.stream(nums).reduce(0,(a,b)->a|b);
    }
}
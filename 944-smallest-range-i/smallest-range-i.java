class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        return (max-k)-(min+k)<0?0:(max-k)-(min+k);
    }
}
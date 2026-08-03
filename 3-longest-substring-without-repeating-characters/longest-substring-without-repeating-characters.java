class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=Integer.MIN_VALUE;
        HashSet<Character> arr=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            while(arr.contains(c))
            {
                arr.remove(s.charAt(left));
                left++;
            }
            arr.add(c);
            max=Math.max(max,right-left+1);
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
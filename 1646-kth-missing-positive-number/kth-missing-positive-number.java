class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++)
        {
            int miss=arr[i]-(i+1);
            if(miss>=k)
            {
                return i+k;
            }
        }
        int totalmiss=arr[arr.length-1]-arr.length;
        int remain=k-totalmiss;
        return arr[arr.length-1]+remain;
    }
}
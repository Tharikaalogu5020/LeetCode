import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {

        HashSet<Integer> s = new HashSet<>();

        // Store all array elements
        for(int n : arr) {
            s.add(n);
        }

        ArrayList<Integer> ans=new ArrayList<>();
        int i=1;
        while(ans.size()<k)
        {
            if(!s.contains(i))
            {
                ans.add(i);
            }
            i++;
        }
        return ans.get(k-1);
    }
}
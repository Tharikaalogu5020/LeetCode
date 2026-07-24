import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {

        HashSet<Integer> s = new HashSet<>();

        // Store all array elements
        for(int n : arr) {
            s.add(n);
        }

        ArrayList<Integer> res = new ArrayList<>();

        int i = 1;

        // Find missing positive numbers until we get k numbers
        while(res.size() < k) {

            if(!s.contains(i)) {
                res.add(i);
            }

            i++;
        }

        // k-th missing number (index k-1)
        return res.get(k - 1);
    }
}
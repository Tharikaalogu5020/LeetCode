class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] a = new int[n];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<edges.size();i++){
            a[edges.get(i).get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                l.add(i);
            }
        }
        return l;
    }
}
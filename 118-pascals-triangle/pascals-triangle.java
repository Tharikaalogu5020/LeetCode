class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> al=new ArrayList<>();
            al.add(1);
            for(int j=1;j<i;j++)
            {
                List<Integer> pre=arr.get(i-1);
                al.add(pre.get(j-1)+pre.get(j));
            }
            if(i>0)
            {
                al.add(1);
            }
            arr.add(al);
        }
        return arr;
    }
}
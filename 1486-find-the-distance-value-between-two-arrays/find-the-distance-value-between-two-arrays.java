class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        boolean[] b=new boolean[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
           
            for(int j=0;j<arr2.length;j++)
            {
               if(Math.abs(arr1[i]-arr2[j])<=d)
               {
                    b[i]=true;
                    break;
               }
            }
        
        
        }
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==false){
                c++;
            }
        }
        return c;
    }
}
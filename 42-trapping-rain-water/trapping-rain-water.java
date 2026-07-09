class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int min=height[0];
        for(int i=0;i<height.length;i++)
        {
           if(height[i]>min)
           {
            leftmax[i]=height[i];
            min=height[i];
           }
           else
           {
            leftmax[i]=min;
           }
        }
        int max=height[height.length-1];
        for(int i=height.length-1;i>=0;i--)
        {
          if(height[i]>max)
          {
            rightmax[i]=height[i];
            max=height[i];
          }
          else
          {
            rightmax[i]=max;
          }
        }
        int ans=0;
        for(int i=0;i<height.length;i++)
        {
           ans+=Math.min(rightmax[i],leftmax[i])-height[i];
        }
        return ans;
    }
}
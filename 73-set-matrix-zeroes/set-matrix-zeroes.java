class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                   row.add(i);
                   col.add(j);
                }
            }
        }
       for(int indexrow:row)
       {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[indexrow][i]=0;
        }
       }
       for(int indexcol:col)
       {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][indexcol]=0;
        }
       }
    }
 
}
class Solution {
    public int bestClosingTime(String customers) {
        int m=0;
        int c=0;
        int mp=0;
        for(int i=0;i<customers.length();i++)
        {
            if(customers.charAt(i)=='Y')
            {
                c++;
            }
            else
            {
                c--;
            }
            if(m<c)
            {
               mp=i+1;
               m=c;
            }

        }
        return mp;
    }
}
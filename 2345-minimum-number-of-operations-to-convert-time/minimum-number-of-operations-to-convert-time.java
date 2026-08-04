class Solution {
    public int convertTime(String current, String correct) {
        int h=Integer.parseInt(current.substring(0,2));
        int m=Integer.parseInt(current.substring(3));
        int h1=Integer.parseInt(correct.substring(0,2));
        int m1=Integer.parseInt(correct.substring(3));
        int start=(h* 60)+m;
        int end=(h1* 60)+m1;
        int dif=start-end;
        int c=0;
        c+=dif/60;
        dif%=60;
        c+=dif/15;
        dif%=15;
        c+=dif/5;
        dif%=5;
        c+=dif;
        return Math.abs(c);
    }
}
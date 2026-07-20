class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)
        {
            return false;
        }
        String special="!@#$%^&*()-+";
        boolean upper=false;
        boolean lower=false;
        boolean specialcase=false;
        boolean digit=false;
        for(int i=0;i<password.length();i++)

        {
            char c=password.charAt(i);
            if(c>='a' && c<='z')
            {
                lower=true;
            }
            else if(c>='A'&& c<='Z')
            {
                upper=true;
            }
            else if(c>='0'&&c<='9')
            {
                digit=true;
            }
            else if(special.indexOf(c)!=-1)
            {
                specialcase=true;
            }
            if(i>0 && password.charAt(i)==password.charAt(i-1))
            {
                return  false;
            }
        }
        return lower&&upper&&digit&&specialcase;
    }
}
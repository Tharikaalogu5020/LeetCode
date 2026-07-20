class Solution {
    public int compress(char[] chars) {
        Stack<Character> s=new Stack();
        s.push(chars[0]);
        String res="";
        for(int i=1;i<chars.length;i++)
        {
            char c=chars[i];
            if(c==s.peek())
            {
                s.push(c);
            }
            else
            {
               char ch=s.peek();
               int count=0;
               while(!s.isEmpty())
               {
                s.pop();
                count++;
               }
               res+=ch;
               if(count>1)
               {
                res+=count;
               }
               s.push(c);
               
            }
        }

        char pek=s.peek();
        int co=0;
        while(!s.isEmpty())
        {
            s.pop();
            co++;
        }
        res+=pek;
        if(co>1)
        {
            res+=co;
        }
        for(int i=0;i<res.length();i++)
        {
            chars[i]=res.charAt(i);
        }
        return res.length();   
    }
}
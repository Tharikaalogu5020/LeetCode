class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> s=new HashSet<>();
        for(String st:words)
        {
            StringBuffer sb=new StringBuffer();
              for(int i=0;i<st.length();i++)
              {
                sb.append(str[st.charAt(i)-'a']);
              }
                s.add(sb.toString());
              
        }
        return s.size();
    }
}
class Solution {
    public String toGoatLatin(String sentence) {
        String[] str_array=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str_array.length;i++)
        {
            String word=str_array[i];
            StringBuffer sb=new StringBuffer();
            if(isvowel(word))
            {
              sb.append(word);
            }
            else
            {
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }
            sb.append("ma");
            for(int j=0;j<=i;j++)
            {
                sb.append("a");
            }
           res.append(sb);
           if(i!=str_array.length-1)
           {
            res.append(" ");
           }

        }
     
        return res.toString();
    }
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                             public static boolean isvowel(String word)
                                                                                                                                                                                             	{
                                                                                                                                                                                                		char c=word.charAt(0);
                                                                                                                                                                                                        		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                                                                                                                                                                                                                		{
                                                                                                                                                                                                                        			return true;
                                                                                                                                                                                                                                    		}
                                                                                                                                                                                                                                            		return false;
                                                                                                                                                                                                                                                    	}
                                                                                                                                                                                                                                                        }


                                                                                           
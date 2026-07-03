class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            while(start<end && !isvowel(arr[start]))
            {
               start++;
            }
            while(start<end && !isvowel(arr[end]))
            {
                end--;
            }
            if(start<end)
            {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return new String(arr);

    }
    public boolean isvowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    public void swap(char[] arr,int start,int end)
    {
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
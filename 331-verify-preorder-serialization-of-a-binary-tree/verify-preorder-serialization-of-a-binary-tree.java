class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] str=preorder.split(",");
        int slot=1;
        for(String s:str)
        {
            if(slot==0)
            {
                return false;
            }
            if(s.equals("#")==false)
            {
                slot=slot+1;
            }
            else{
            slot--;
            }
        }
        return slot==0;
    }
}
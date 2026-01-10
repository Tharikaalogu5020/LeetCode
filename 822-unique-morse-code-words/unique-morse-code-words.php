class Solution {

    /**
     * @param String[] $words
     * @return Integer
     */
    function uniqueMorseRepresentations($words) {
        $store=array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        $has=[];
        foreach($words as $key)
        {
            $res="";
            for($i=0;$i<strlen($key);$i++)
            {
               $index=ord($key[$i])-97;
               $res.=$store[$index];
            }
            $has[$res]=true;
        }
        return count($has);
    }
}
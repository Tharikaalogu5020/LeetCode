class Solution {
    HashMap<String,Boolean> hm=new HashMap<>();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> h=new HashSet<>();
        List<String> l=new ArrayList<>();
        for(String w:words)
        {
            h.add(w);
        }
        for(int i=0;i<words.length;i++)
        {
            if(find(words[i],h))
            {
                l.add(words[i]);
            }
        }
        return l;
    }
    public boolean find(String w,HashSet<String> hs)
    {
        if(hm.containsKey(w))
        {
            return hm.get(w);
        }
        for(int i=1;i<w.length();i++)
        {
            String pre=w.substring(0,i);
            String suf=w.substring(i);
            if(hs.contains(pre))
            {
                if(hs.contains(suf)||find(suf,hs))
                {
                    hm.put(w,true);
                    return true;
                }
            }

        }
        hm.put(w,false);
        return false;
    }
}
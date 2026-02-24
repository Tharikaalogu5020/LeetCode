class Solution {
    public int maxNumberOfBalloons(String text) {
      
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:text.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
       
            if(!m.containsKey('b')||!m.containsKey('a')||!m.containsKey('l')||!m.containsKey('o')||!m.containsKey('n'))
            {
                  return 0; 
            }
    int b=m.get('b');
    int a=m.get('a');
    int l=m.get('l')/2;
    int o=m.get('o')/2;
    int n=m.get('n');
    return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
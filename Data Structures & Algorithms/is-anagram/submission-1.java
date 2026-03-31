class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s_chars = new HashMap<>();
        Map<Character,Integer> t_chars = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(s_chars.get(sc)==null)
            {
                s_chars.put(sc,1);
            }else{
                s_chars.put(sc,s_chars.get(sc)+1);
            }
            if(t_chars.get(tc)==null)
            {
                t_chars.put(tc,1);
            }else{
                t_chars.put(tc,t_chars.get(tc)+1);
            }
            
        }
        
        return s_chars.equals(t_chars);
        
    }
}

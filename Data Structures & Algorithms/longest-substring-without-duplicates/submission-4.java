class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        //two pointer solution
        int l = 0;
        int max = 0;

        for(int i=0;i<s.length();i++)
        {
           while(unique.contains(s.charAt(i)))
           {
                unique.remove(s.charAt(l));
                l++;
           }
           unique.add(s.charAt(i));
           max = Math.max(max,i-l+1);
            
        }
        return max;
    }
}

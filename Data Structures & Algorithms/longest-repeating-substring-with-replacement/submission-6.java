class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0;
        Set<Character> charSet = new HashSet<>();
        for (char c: s.toCharArray()){
            charSet.add(c);
        }

        for(char c:charSet){
            int count = 0;l = 0;
            for(int r = 0;r<s.length();r++)
            {
                if(s.charAt(r) == c){
                    count++;
                }
                while ((r - l + 1)-count>k)
                {
                    if(s.charAt(l)==c){
                        count--;
                    }
                    l++;
                }
                max = Math.max(max,r-l+1);
            }
            
        }
        return max;
    }
}

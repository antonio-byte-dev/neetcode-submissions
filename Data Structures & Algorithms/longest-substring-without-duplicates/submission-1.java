class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            count++;
            max=Math.max(count,max);
            unique.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                if(!unique.contains(s.charAt(j)))
                {
                    count++;
                    max = Math.max(max,count);
                    unique.add(s.charAt(j));
                }else{
                    break;
                }
            }
            count=0;
            unique.clear();
            
        }
        return max;
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        for(int i=0;i<s2.length();i++)
        {
            int j = i;
            int count = 0;
            while(j<s2.length()&&s1.indexOf(s2.charAt(j))!=-1)
            {
                    
                    s1 = s1.replaceFirst(""+s2.charAt(j),(""+s2.charAt(j)).toUpperCase());
                    j++;
                    count++;
            }  
            if(count == s1.length()) return true;
            s1 = s1.toLowerCase();
        }
        return false;
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Finite arrays are O(1) time complexity!!!!
        Map<Character,Integer> count1 = new HashMap<Character,Integer>();
       
        if(s1.length()>s2.length()) return false;

        for(char c: s1.toCharArray())
        {
            count1.put(c,count1.getOrDefault(c,0)+1);
        }
        int need = count1.size();
        for(int i=0;i<s2.length();i++)
        {
            Map<Character,Integer> count2 = new HashMap<Character,Integer>();

            int count = 0;
            for(int j=i;j<s2.length();j++)
            {
                char c = s2.charAt(j);
                count2.put(c,count2.getOrDefault(c,0)+1);

                if(count1.getOrDefault(c,0)<count2.get(c))break;
                
                if(count1.getOrDefault(c,0)==count2.get(c))
                {
                    count++;
                }
                if(count==need)return true;
            }
        }
        return false;
    }
}

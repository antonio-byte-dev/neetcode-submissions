class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group= new ArrayList<>();
        Map<List<Integer>,Integer> group_index = new HashMap<>();

        int index=0;
        for(int i=0;i<strs.length;i++)
        {
            List<Integer> freq = new ArrayList<>(Collections.nCopies(26,0));
            for(int j=0;j<strs[i].length();j++)
            {
                int pos = strs[i].charAt(j)-'a';
                freq.set(pos,freq.get(pos)+1);
            }
            if(group_index.get(freq)==null){
                group_index.put(freq,index);
                List<String> word = new ArrayList<>();
                word.add(strs[i]);
                group.add(word);
                index++;
            }else{
                int w_ind = group_index.get(freq);
                group.get(w_ind).add(strs[i]);
            }
            System.out.println(group_index.get(freq));
        }
        
        
        return group;
        
    }
}

class Solution {
    public void backtrack(int i,int[] candidates,int target, List<Integer> set, List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(set));
            
            return;
        }
        if(target<0||i>=candidates.length) return;
       
        set.add(candidates[i]);
        backtrack(i+1,candidates,target-candidates[i],set,res);

        set.remove(set.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1])
        {
            i++;
        }
        //if(i<candidates.length-1&&candidates[i+1]==candidates[i]){
         //   backtrack(i,candidates,target,set,res);
         backtrack(i+1,candidates,target,set,res);
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),res);
        return res;
    }
}

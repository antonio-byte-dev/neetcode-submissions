class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int max = 0;
        while(start<end)
        {
            int val=(end-start)*Math.min(heights[start],heights[end]);
            max = Math.max(max,val);
            if(heights[end]<heights[start])
            {
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}

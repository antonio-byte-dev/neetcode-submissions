class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        int start = 0;
        int end = matrix.length-1;
        int mid = 0;
        while(start<=end)
        {

            mid = (start+end)/2;
            System.out.println(mid);
            if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target)break;
            if(matrix[mid][0]>target)
            {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        int list = mid;

        start = 0;
        end = matrix[list].length-1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(matrix[list][mid]==target)return true;
            else if(matrix[list][mid]>target)
            {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;

    }
}

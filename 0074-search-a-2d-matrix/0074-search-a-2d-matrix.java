class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int l=0,r=matrix[0].length-1;
        while(l<n&&r>=0){
            int temp=matrix[l][r];
            if(temp==target){
                return true;
            }
            if(temp<target){
                l++;

            }
            else{
                r--;
            }
        }
        return false;
    }
}
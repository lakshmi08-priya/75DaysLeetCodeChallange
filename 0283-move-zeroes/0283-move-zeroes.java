class Solution {
    public void moveZeroes(int[] nums) {
        int r=0,n=nums.length;
        while(r<n){
            if(nums[r]==0){
                int l=r+1;
                while(l<n){
                    if(nums[l]!=0){
                        break;
                    }
                    l++;
                }
                if(l<n){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                }
                else{
                    break;
                }
            }
            r++;
        }
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int rs=0,ls=0,n=nums.length;
        for(int i=0;i<n;i++){
            rs+=nums[i];
        }
        for(int i=0;i<n;i++){
            rs-=nums[i];
            if(ls==rs){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        int n=nums.length;
        double val=(double)Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        val=Math.max(val,sum/(double)k);
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            val=Math.max(val,sum/(double)k);
        }
        return val;
    }
}
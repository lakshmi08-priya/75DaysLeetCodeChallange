class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int res=0;
        while(l<r){
            int temp=Math.min(height[l],height[r])*(r-l);
            res=Math.max(res,temp);
            if(height[l]<height[r]){
                l+=1;
            }
            else if(height[r]<=height[l]){
                r-=1;
            }
        }
        return res;
    }
}
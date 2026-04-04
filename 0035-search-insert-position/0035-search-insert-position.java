class Solution {
    public int searchInsert(int[] a, int target) {
        int l=0,r=a.length;
        int ans=-1;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]<target){
               l=mid+1;
            }
            else{
                r=mid;
                //System.out.println(ans);
            }
        }
        return l;
    }
}
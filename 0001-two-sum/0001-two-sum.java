class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                 res[0]=h.get(target-nums[i]);
                 res[1]=i;
                 break;
            }
            else
            h.put(nums[i],i);
        }
        return res;
    }
}
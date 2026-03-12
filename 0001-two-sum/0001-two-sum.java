class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmm=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hmm.containsKey(target-nums[i])){
                 res[0]=hmm.get(target-nums[i]);
                 res[1]=i;
                 break;
            }
            else
            hmm.put(nums[i],i);
        }
        return res;
    }
}
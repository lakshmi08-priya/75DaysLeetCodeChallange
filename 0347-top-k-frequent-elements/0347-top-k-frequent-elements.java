class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            max=Math.max(hm.get(nums[i]),max);
        }
       ArrayList<ArrayList<Integer>> l=new ArrayList<>();
       for(int i=0;i<=max;i++){
        l.add(new ArrayList<>());
       }
       for(Map.Entry<Integer,Integer> m:hm.entrySet()){
               l.get(m.getValue()).add(m.getKey());
       }
       int[] ar=new int[k];
       int j=0;
       for(int i=max;i>=1;i--){
        Collections.sort(l.get(i),Collections.reverseOrder());
       
       
       for(int n:l.get(i)){
        ar[j++]=n;
        if(j==k)
        return ar;
       }
    }
    return ar;
    }
}
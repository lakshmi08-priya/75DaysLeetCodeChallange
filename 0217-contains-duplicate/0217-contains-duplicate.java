class Solution {
    public boolean containsDuplicate(int[] num) {
        Set<Integer> h=new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(h.contains(num[i])){
                return true;
            }
            h.add(num[i]);
        }
        return false;
    }
}
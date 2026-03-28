class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        while(hm.get(ch)>1){
            char c=s.charAt(l);
            if(hm.get(c)>1){
                hm.put(c,hm.get(c)-1);}
            else{
                hm.remove(c);}
            l++;}
        ans=Math.max(ans,hm.size());}
        return ans;
    }}
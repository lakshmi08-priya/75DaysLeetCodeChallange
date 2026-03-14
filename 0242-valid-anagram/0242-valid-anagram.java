class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
         hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(hm.containsKey(c)){
                int r=hm.get(c)-1;
                if(r==0){
                    hm.remove(c);
                }
                else
                hm.put(c,r);
            }
        }
        if(hm.size()==0)
        return true;
        return false;
    }
}
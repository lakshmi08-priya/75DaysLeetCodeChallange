class Solution {
    public static String gethash(String s){
        StringBuilder sb=new StringBuilder();
        int[] fq=new int[26];
        for(int i:s.toCharArray()){
                fq[i-'a']+=1;
        }
        for(int i=0;i<26;i++){
            sb.append(fq[i]);
            sb.append('$');
        }
        return sb.toString();
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();    
        HashMap<String,Integer> hm=new HashMap<>(); 
        int n=strs.length;
        for(int i=0;i<n;i++){
            String s=gethash(strs[i]);
            if(!hm.containsKey(s)){
                hm.put(s,l.size());
                l.add(new ArrayList<>());
            }
            l.get(hm.get(s)).add(strs[i]);
            // System.out.print(strs[i]+" ");
        }
        return l;
    }
}
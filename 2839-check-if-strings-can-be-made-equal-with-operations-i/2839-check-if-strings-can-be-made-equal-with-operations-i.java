class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))
        return true;
        char[] s=s1.toCharArray();
        char[] sb=s2.toCharArray();
        int cnt=0;
        for(int i=0;i<4;i++){
            if(s[i]!=sb[i]&&i<2){
                char temp=s[i+2];
                 s[i+2]=s[i];
                 s[i]=temp;
            }
            
        }
        s1=Arrays.toString(s);
        s2=Arrays.toString(sb);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
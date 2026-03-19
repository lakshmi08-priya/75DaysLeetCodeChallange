class Solution {
   
    public boolean isPalindrome(String s) {
        StringBuilder sbb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c)){
                     sbb.append(Character.toLowerCase(c));
            }
        }
   // System.out.println(sb);
   int n=sbb.length();
   for(int i=0;i<n/2;i++){
    if(sbb.charAt(i)!=sbb.charAt(n-i-1))
    return false;
   }
   return true;
        //return sb.equals(sb.reverse());
    }
}
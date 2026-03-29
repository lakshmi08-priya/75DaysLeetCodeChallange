class Solution {
    public boolean isValid(String s) {
        //int cnt=0;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
              char c=s.charAt(i);
              if(c=='('||c=='['||c=='{'){
                stk.push(c);
              }
              else{
                if(stk.isEmpty())
                return false;
                char ch=stk.pop();
                if(c==')'&&ch!='('){
                    return false;
                }
                if(c==']'&&ch!='['){
                    return false;
                }
                if(c=='}'&&ch!='{'){
                    return false;
                }
              }
        } 
        if(stk.isEmpty()) 
        return true;
        return false;
    }
}
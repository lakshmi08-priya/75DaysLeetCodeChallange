class Solution {
    public static int divison(int a,int b){
        
        return (a/b);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String s:tokens){
            if(Character.isDigit(s.charAt(0))||(s.length()>1)&&(s.charAt(0)=='-')){
                stk.push(Integer.parseInt(s));
            }
            else{
                int v1=stk.pop(),v2=stk.pop();
                if(s.equals("+")){
                   stk.push(v1+v2);
                }
                if(s.equals("-")){
                    stk.push(v2-v1);
                }
                if(s.equals("*")){
                    stk.push(v2*v1);
                }
                if(s.equals("/")){
                    int val=divison(v2,v1);
                    stk.push(val);
                }
            }
        }
        return stk.pop();
    }
}
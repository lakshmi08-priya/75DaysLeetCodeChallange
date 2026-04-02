import java.util.*;
class MinStack {
    int min=Integer.MAX_VALUE;
    List<Integer> s1,s2;
    public MinStack() {
        s1=new ArrayList<>();
        s2=new ArrayList<>();
    }    
    public void push(int val) {
        if(s1.isEmpty()){
           s1.add(val);
           s2.add(val);
        }
        else{
            s1.add(val);
            s2.add(Math.min(val,s2.get(s2.size()-1)));
        }
    
    }
    
    public void pop() {
        if(s1.isEmpty()){
            return;
        }
        s2.remove(s1.size()-1);
        s1.remove(s1.size()-1);
    }
    
    public int top() {
        return s1.get(s1.size()-1);
    }
    
    public int getMin() {
        return s2.get(s2.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
import java.util.*;
class MyQueue {
    List<Integer> s1,s2;
    public MyQueue() {
        s1=new ArrayList();
        s2=new ArrayList();
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                int k=s1.remove(s1.size()-1);
                s2.add(k);
            }
        }
        
            return s2.remove(s2.size()-1);
    }
    
    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                int k=s1.remove(s1.size()-1);
                s2.add(k);
            }
        }
      
            return s2.get(s2.size()-1);
       
    }
    
    public boolean empty() {
        if(s1.isEmpty()&&s2.isEmpty())
        return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] arr=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                //int val=s.peek();
                while(!s.isEmpty()&&t[s.peek()]<t[i]){
                    int val=s.peek();
                    arr[val]=i-val;
                    s.pop();
                }
                s.push(i);
            }
        }
            while(!s.isEmpty()){
                int val=s.pop();
                arr[val]=0;
            }
        return arr;
    }
}
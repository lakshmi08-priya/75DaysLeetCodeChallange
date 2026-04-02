class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(int i=n-2;i>=0;i--){
            int j=i+1;
            while(j<n){
            if(t[i]<t[j]){
                arr[i]=j-i;
                break;
            }
            else if(arr[j]==0){
                arr[i]=0;
                break;
            }
            else{
                j=j+arr[j];
            }
            }
        }
        // Stack<Integer> s=new Stack<>();
        // for(int i=0;i<n;i++){
        //     if(s.isEmpty()){
        //         s.push(i);
        //     }
        //     else{
        //         //int val=s.peek();
        //         while(!s.isEmpty()&&t[s.peek()]<t[i]){
        //             int val=s.peek();
        //             arr[val]=i-val;
        //             s.pop();
        //         }
        //         s.push(i);
        //     }
        // }
        //     while(!s.isEmpty()){
        //         int val=s.pop();
        //         arr[val]=0;
        //     }
        return arr;
    }
}
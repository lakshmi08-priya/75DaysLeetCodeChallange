class Solution {
    public int maxProfit(int[] prices) {
        int i,max=0,temp,low=prices[0];
       for(i=1;i<prices.length;i++){
           if(prices[i]<low)
           low=prices[i];
           temp=prices[i]-low;
           max=Math.max(temp,max);
       }
        
        return max;}
    }

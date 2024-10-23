class Solution {
    public int[] finalPrices(int[] prices) {
       int n=prices.length;
       int nse[]=new int[n];
       Stack<Integer>st=new Stack<>();
       for(int i=n-1;i>=0;i--)
       {
          while(!st.isEmpty()&&st.peek()>prices[i])
          {
            st.pop();
          }
          if(st.isEmpty()==true)
            nse[i]=prices[i];
            else
            {
                nse[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
       } 
       for(int num:nse)
        System.out.print(num+" ");
        return nse;
    }
}
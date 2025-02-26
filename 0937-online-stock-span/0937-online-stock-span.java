class StockSpanner {
      Stack<pair>st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
       int ans=1;
       while(!st.isEmpty()&&st.peek().price<=price)
       {
          ans+=st.pop().span;
       }
          st.push(new pair(price,ans));
       return ans;
    }
}
class pair
{
    int price;
    int span;
    public pair(int price,int span)
    {
        this.price=price;
        this.span=span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
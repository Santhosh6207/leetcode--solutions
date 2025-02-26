class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) 
                
            {
                int a=(st.pop());
                int b=(st.pop());
                int result=solve(b,a,tokens[i]);
                st.push(result);
            }
            else
            st.push(Integer.parseInt(tokens[i]));
        }
       return st.peek(); 
    }
    public int solve(int a,int b,String ch)
    {
        if(ch.equals("+"))
         return a+b;
         if(ch.equals("-"))
          return a-b;
          if(ch.equals("*"))
           return a*b;
           if(ch.equals("/"))
            return a/b;
            return 0;
    }
}
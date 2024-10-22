class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        int n=num.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {   
            while(!st.isEmpty()&&(st.peek())>num.charAt(i)&&k>0)
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));

        }
         while(k-->0)
            {  
                if(!st.isEmpty())
                st.pop();
            }
            if(st.isEmpty()==true)
             return "0";
             while(!st.isEmpty())
             {
                sb.append(st.pop());
             }
           sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();  
    }
}
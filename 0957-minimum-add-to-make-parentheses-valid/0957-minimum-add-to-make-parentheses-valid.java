class Solution {
    public int minAddToMakeValid(String s) {
        int close=0;
        int open=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                close++;
            }
            else if(close>0)
              close--;
              else
              open++;
        }
           return open+close;
    }
}
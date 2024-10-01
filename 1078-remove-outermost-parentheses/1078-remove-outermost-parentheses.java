class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=1;i<s.length();i++)
        {   
            if(s.charAt(i)=='(')
              {
                c++;
                sb.append('(');
              }
              else
              {
                if(c==0)
                 i++;
                 else
                 {
                    sb.append(')');
                    c--;
                 }

              }

        }
        return sb.toString();
    }
}
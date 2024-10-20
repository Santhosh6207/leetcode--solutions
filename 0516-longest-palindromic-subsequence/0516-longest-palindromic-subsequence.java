class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String str=sb.reverse().toString();
        Integer dp[][]=new Integer[s.length()+1][str.length()+1];
        int res=solve(0,0,s,str,dp);
        return res;
    }
    public int solve(int i,int j,String s,String str,Integer dp[][])
    {
        if(i==s.length()||j==str.length())
          return 0;
          
          if(dp[i][j]!=null)
            return dp[i][j];
          if(s.charAt(i)==str.charAt(j))
            {
              dp[i][j]= 1+solve(i+1,j+1,s,str,dp);
            }
            else
           dp[i][j]=Math.max(solve(i+1,j,s,str,dp),solve(i,j+1,s,str,dp));
         return dp[i][j];
       }
}
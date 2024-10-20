class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        Integer dp[][]=new Integer[n+1][m+1];
        int res=solve(0,0,word1,word2,dp);
        return ((n+m)-(2*res));
    }
    public int solve(int i,int j,String s,String st,Integer dp[][])
    {
        if(i==s.length()||j==st.length())
          return 0;
          if(dp[i][j]!=null)
            return dp[i][j];
            if(s.charAt(i)==st.charAt(j))
             {
                dp[i][j]=1+solve(i+1,j+1,s,st,dp);
             }
             else
             {
                dp[i][j]=Math.max(solve(i+1,j,s,st,dp),solve(i,j+1,s,st,dp));
             }
             return dp[i][j];
    }
}
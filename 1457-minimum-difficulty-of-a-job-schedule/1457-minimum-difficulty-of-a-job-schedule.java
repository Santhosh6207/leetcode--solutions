class Solution {
    Integer dp[][];
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
       dp=new Integer[n+1][d+1];
        if(n<d)
          return -1;
        int res=solve(jobDifficulty,d,n,0);
        return res;
        
    }
    public int solve(int ar[],int d,int n,int idx)
    {    if(d==1)
       {
             int maxd=ar[idx];
             for(int i=idx;i<n;i++)
             {
                maxd=Math.max(maxd,ar[i]);
             }
             return maxd;
       }
       if(dp[idx][d]!=null){
        return dp[idx][d];
       }
        int max=ar[idx];
        int finalres=Integer.MAX_VALUE;
        for(int i=idx;i<=n-d;i++)
        {
             max=Math.max(ar[i],max);
             int re=(max+solve(ar,d-1,n,i+1));
              finalres=Math.min(re,finalres); 
        }
        return  dp[idx][d]=finalres;
    }
}
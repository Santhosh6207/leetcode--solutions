class Solution {
     int dp[][];
    public int maxMoves(int[][] grid) {
      int row=grid.length-1;
      int col=grid[0].length-1;
      dp=new int[row+1][col+1];
      for(int ro[]:dp)
      {
        Arrays.fill(ro,-1);
      }
      int res=0;
      for(int i=0;i<=row;i++)
      {
        int temp=solve(i,0,row,col,grid);
        res=Math.max(res,temp);
      }
      return res;
    }
    public int solve(int idx,int id,int row,int col,int grid[][])
    {
          if(idx<0||idx>row||id>col)
            return 0;
            if(dp[idx][id]!=-1)
              return dp[idx][id];
            int dup=0,right=0,ddown=0;
            if(idx-1>=0&&id+1<=col&&grid[idx-1][id+1]>grid[idx][id])
            {
                dup=1+solve(idx-1,id+1,row,col,grid);
            }
            if(id+1<=col&&grid[idx][id+1]>grid[idx][id])
            {
                right=1+solve(idx,id+1,row,col,grid);
            }
            if(idx+1<=row&&id+1<=col&&grid[idx+1][id+1]>grid[idx][id])
            {
                ddown=1+solve(idx+1,id+1,row,col,grid);
            }
            return dp[idx][id]=Math.max(dup,Math.max(right,ddown));
    }
}
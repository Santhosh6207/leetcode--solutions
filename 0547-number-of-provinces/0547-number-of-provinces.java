class Solution {
    public int findCircleNum(int[][] isConnected) {
       int len=isConnected.length;
       boolean visited[]=new boolean[len];
       int count=0;
       for(int i=0;i<len;i++)
       {
        if(!visited[i])
        {
            count++;
            dfs(i,isConnected,visited);
        }

       } 
       return count;
    }
    public void dfs(int i,int ar[][],boolean[] visit)
    {
        visit[i]=true;
        for(int j=0;j<ar.length;j++)
        {
            if(ar[i][j]==1&&!visit[j])
            {
                dfs(j,ar,visit);
            }
        }
    }
}
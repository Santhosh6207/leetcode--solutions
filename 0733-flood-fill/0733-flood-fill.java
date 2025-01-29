class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        if(original!=color)
        dfs(image,sr,sc,color,original);
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int c,int original)
    {
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=original||image[sr][sc]==c)
            return;
           image[sr][sc]=c;
           dfs(image,sr-1,sc,c,original);
            dfs(image,sr,sc-1,c,original);
             dfs(image,sr+1,sc,c,original);
              dfs(image,sr,sc+1,c,original);


    }
}

class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=heights[i];
            }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]!=heights[i])
                count++;
        }
        return count;
    }
}
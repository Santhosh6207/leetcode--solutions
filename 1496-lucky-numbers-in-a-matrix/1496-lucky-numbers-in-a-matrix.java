class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer>al=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
         int row[]=new int[n];
         int col[]=new int[m];
        for(int i=0;i<n;i++)
        {
            row[i]=matrix[i][0];
            for(int j=0;j<m;j++)
            {
                row[i]=Math.min(row[i],matrix[i][j]);
            }
        }
        
        for(int j=0;j<m;j++)
        {
            col[j]=matrix[0][j];
            for(int i=0;i<n;i++)
            {
                col[j]=Math.max(col[j],matrix[i][j]);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(row[i]==col[j] && row[i]==matrix[i][j])
               {
                   al.add(row[i]);
                    // return the first lucky number found
               }
            }
        }
        return al;
    }
}

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        int n=chalk.length;
        for(int i=0;i<n;i++)
        {
            sum+=chalk[i];

        }
       if(k>=sum)
       {
        k=k%(int)sum;
       }
        for(int i=0;i<n;i++)
        {
            if(chalk[i]>k)
              return i;
              k=k-chalk[i];

        }
      return 0;
    }
}
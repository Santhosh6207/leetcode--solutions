class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      int sum=k;
      int n=chalk.length;
      int i=0;
      while(sum>=chalk[i])
      {
          sum-=chalk[i];
          i++;
          if(i==n)
          {
            i=0;
          }
          
      }
    return i;
    }
}
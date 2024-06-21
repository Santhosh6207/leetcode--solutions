class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        int n=grumpy.length;
        int sum=0;
        int ms=0;
        for(int i=0;i<n;i++)
        {
            sum+=(customers[i]*(1-grumpy[i]));
        }
        int left=0;
        int right=m;
        for(int i=0;i<m;i++)
        {
            sum+=(customers[i]*grumpy[i]);
        }
        ms=sum;

        while(right<n)
        {    
            sum+=customers[right]*grumpy[right];
            sum-=customers[left]*grumpy[left];
            ms=Math.max(ms,sum);
            right++;
            left++;
        }
     return ms;
      
    }
}
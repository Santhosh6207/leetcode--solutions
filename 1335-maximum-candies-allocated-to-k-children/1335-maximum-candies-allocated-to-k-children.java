class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum=0;
        int max=candies[0];
        for(int num:candies)
        {
            sum+=num;
            if(num>max)
            {
                max=num;
            }
        }
        if(k>sum)
         return 0;
         int res=0;
         int low=1;
         int high=max;
         while(low<=high)
         {
            int mid=(low+high)/2;
            if(solve(candies,k,mid))
            {
                low=mid+1;
                res=mid;
            }
            else
            high=mid-1;
         }
         return res;
    }
    public boolean solve(int ar[],long k,int mid)
    {
        long c=0;
        for(int num:ar)
        {
            c+=(num/mid);
        }
        return c>=k;
    }
}
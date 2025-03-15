class Solution {
    public boolean canSteal(int ar[],int k,int mid)
    {
        int i=0;
        int count=0;
        while(i<ar.length)
        {
            if(ar[i]<=mid)
            {
                count++;
                i+=2;
            }
            else
            {
                i++;
            }
        }
        return count>=k;
    }
    public int minCapability(int[] nums, int k) {
       int low=minCap(nums);
       int high=maxCap(nums);
       while(low<high)
       {
        int mid=(low+high)/2;
        if(canSteal(nums,k,mid))
        {
            high=mid;
        }
        else
        {
            low=mid+1;
        }
       } 
       return low;
    }
    public int minCap(int nums[])
    {
        int min=nums[0];
        for(int num:nums)
        {
            if(num<min)
            min=num;
        }
        return min;
    }
     public int maxCap(int nums[])
    {
        int min=nums[0];
        for(int num:nums)
        {
            if(num>min)
            min=num;
        }
        return min;
    }
}
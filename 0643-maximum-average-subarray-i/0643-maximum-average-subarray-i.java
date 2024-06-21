class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avgsum=0;
        double max=0;
        for(int i=0;i<k;i++)
        {
            avgsum+=nums[i];
        }
        max=avgsum;
        int left=0;
        int right=k;
        while(right<n)
        {   
        
            avgsum=(avgsum+nums[right]);
           // max=Math.max(max,avgsum);
           
            avgsum=(avgsum-nums[left]);
             max=Math.max(max,avgsum);
           
        
         right++;
            left++;
        }
        return max/k;
    }
}
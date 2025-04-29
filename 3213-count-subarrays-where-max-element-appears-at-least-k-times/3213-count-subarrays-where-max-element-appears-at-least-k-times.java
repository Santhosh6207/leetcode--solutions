class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        for(int num:nums)
        {
            maxi=Math.max(num,maxi);
        }
        long maxOccurence=0;
        int left=0;
        long res=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==maxi)
            {
                maxOccurence++;
            }
            while(maxOccurence>=k)
            {
                if(nums[left]==maxi)
                {
                    maxOccurence--;
                   
                }
                 left++;
            }
            res+=left;
        }
        return res;
    }
}
class Solution {
    public int maximumCount(int[] nums) {
        int c=0,c1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                c++;
            else if(nums[i]<0)
                c1++;
                
        }
        return Math.max(c,c1);
        
    }
}
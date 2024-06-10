class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left=0;
       int right=0;
       int min=Integer.MAX_VALUE;
       int cs=0;
       while(right<nums.length)
       {     
            cs+=nums[right];
            while(left<=right&&cs>=target)
            {
                min=Math.min(min,right-left+1);
                cs-=nums[left++];
            }
            right++;
       }
         if(min==Integer.MAX_VALUE)
           return 0;
           return min;
        
    }
}
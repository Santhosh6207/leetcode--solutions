class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length<3)
         return 0;
        int prefix[]=new int[nums.length];
        int sufix[]=new int[nums.length];
        prefix[0]=nums[0];
        sufix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            sufix[i]=Math.max(sufix[i+1],nums[i]);
        }
        long res=0;
        for(int i=1;i<nums.length-1;i++)
        {
            res=Math.max(res,(long)(prefix[i-1]-nums[i])*sufix[i+1]);
        }
        return res;
    }
}
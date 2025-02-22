class Solution {
    public int longestSubarray(int[] nums) {
        int zeroscount=0;
        int i=0;
        int result=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
             zeroscount++;
             while(zeroscount>1)
             {
                if(nums[i]==0)
                  zeroscount--;
                  i++;
             }
             result=Math.max(result,j-i);
        }
        return result;
    }
}